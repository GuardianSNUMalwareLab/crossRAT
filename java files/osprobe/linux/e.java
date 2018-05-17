package osprobe.linux;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class e extends h {
    private File a;
    private String b;

    public e(String var1, String var2) {
        this(new File(var1), var2);
    }

    private e(File var1, String var2) {
        this.a = var1;
        this.b = var2;
    }

    public final boolean a() {
        if (this.a.exists()) {
            try {
                BufferedReader var1 = new BufferedReader(new InputStreamReader(new FileInputStream(this.a)));

                String var2;
                while ((var2 = var1.readLine()) != null) {
                    if (var2.toLowerCase().contains(this.b.toLowerCase())) {
                        var1.close();
                        return true;
                    }
                }

                var1.close();
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }

        return false;
    }
}

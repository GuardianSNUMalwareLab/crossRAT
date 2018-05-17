package osprobe.c;

import crossrat.e;

import java.io.File;
import java.util.Iterator;

public final class a {
    public static boolean a(boolean var0) {
        File var1 = new File("/usr/bin/sw_vers");

        try {
            Iterator var2 = e.a(var1).iterator();

            while (var2.hasNext()) {
                if (((String) var2.next()).contains(a.c.b.a())) {
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        if (var0) {
            String var4;
            return (var4 = System.getProperty("os.name").toLowerCase()).contains("mac os x") || var4.contains("macos");
        } else {
            return false;
        }
    }
}

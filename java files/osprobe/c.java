package osprobe;

import osprobe.linux.g;

// OS type enum
public enum c {
    a("Windows", new String[]{"win"}),
    b("macOS", new String[]{"mac"}),
    c("Linux", new String[]{"linux", "BSD", "Solaris", "solaris", "sunos"}),
    d("Solaris", new String[]{"solaris", "sunos"}),
    e("BSD", new String[0]),
    f("unknown", new String[]{"unknown"});

    private static a g;
    private String h; // Name?
    private String[] i; // Synonyms?

    private c(String var3, String... var4) {
        this.h = var3;
        this.i = var4;
    }

    // OS detection
    public static a b() {
        boolean var0 = true;
        Object var5 = null;
        if (g == null) {
            osprobe.bsd.b var1;
            if ((var1 = crossrat.e.a(true)) != null) {
                var5 = new osprobe.bsd.a(var1);
            }

            boolean var6 = true;
            String var10000;
            c var7;
            boolean var10;
            if (true) {
                var10000 = System.getProperty("os.name").toLowerCase();
                var7 = c;
                var10 = var10000.contains(c.i[0]);
            } else {
                var10 = false;
            }

            if (var10) {
                var5 = new g(crossrat.e.d());
            }

            if (a.c.a.a(true)) {
                var5 = new a.c.b();
            }

            var6 = true;
            if (true) {
                var10000 = System.getProperty("os.name").toLowerCase();
                var7 = a;
                var10 = var10000.contains(a.i[0]);
            } else {
                var10 = false;
            }

            if (var10) {
                var5 = new a.e.a();
            }

            label56:
            {
                var6 = true;
                if (true) {
                    var7 = d;
                    String[] var4 = d.i;
                    int var3 = d.i.length;

                    for (int var2 = 0; var2 < var3; ++var2) {
                        String var8 = var4[var2];
                        if (System.getProperty("os.name").toLowerCase().contains(var8)) {
                            var10 = true;
                            break label56;
                        }
                    }
                }

                var10 = false;
            }

            if (var10) {
                var5 = new a.d.a();
            }

            if (var5 == null) {
                var5 = new e();
            }

            if (var5 instanceof d) {
                d var9;
                (var9 = (d) var5).a(crossrat.e.c());
            }

            g = (a) var5;
        } else {
            var5 = g;
        }

        return (a) var5;
    }

    public final String a() {
        return this.h;
    }
}

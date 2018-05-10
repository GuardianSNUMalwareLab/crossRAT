package a.a;

import crossrat.e;

public enum b {
    a("FreeBSD", new String[0]),
    b("OpenBSD", new String[0]),
    c("NetBSD", new String[0]),
    d("DragonFlyBSD", new String[]{"DragonFly"}),
    e("Unknown BSD", new String[]{"BSD"});

    private String f;
    private String[] g;

    private b(String var3, String... var4) {
        this.f = var3;
        this.g = var4;
    }

    public static b a(String var0) {
        b[] var4;
        int var3 = (var4 = values()).length;

        for (int var2 = 0; var2 < var3; ++var2) {
            b var1;
            if ((var1 = var4[var2]).f.toLowerCase().contains(var0.toLowerCase())) {
                return var1;
            }

            String[] var8 = var1.g;
            int var7 = var1.g.length;

            for (int var6 = 0; var6 < var7; ++var6) {
                if (var8[var6].toLowerCase().contains(var0.toLowerCase())) {
                    return var1;
                }
            }
        }

        return null;
    }

    public static b b() {
        return crossrat.e.a(true);
    }

    public final String a() {
        return this.f;
    }
}

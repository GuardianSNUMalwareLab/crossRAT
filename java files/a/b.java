package a;

// Architecture enum.
public enum b {
    a(new String[]{"x86", "i386", "i486", "i586", "i686"}),
    b(new String[]{"x86_64", "amd64", "k8"}),
    c(new String[]{"ARM"}),
    d(new String[]{"Unknown"});

    // Synonyms.
    private String[] e;

    private b(String... var3) {
        this.e = var3;
    }

    // Detect architecture, checking for synonyms.
    public static b a() {
        String var0 = System.getProperty("os.arch");
        b[] var4;
        int var3 = (var4 = values()).length;

        for (int var2 = 0; var2 < var3; ++var2) {
            b var1;
            String[] var8;
            int var7 = (var8 = (var1 = var4[var2]).e).length;

            for (int var6 = 0; var6 < var7; ++var6) {
                String var5 = var8[var6];
                if (var0.equalsIgnoreCase(var5)) {
                    return var1;
                }
            }
        }

        return d;
    }
}

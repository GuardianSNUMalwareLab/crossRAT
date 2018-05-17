package osprobe.mac;

public enum MacTypes {
    a("Cheetah", "10.0", true),
    b("Puma", "10.1", true),
    c("Jaguar", "10.2", true),
    d("Panther", "10.3", true),
    e("Tiger", "10.4", true),
    f("Leopard", "10.5", true),
    g("Snow Leopard", "10.6", true),
    h("Lion", "10.7", true),
    i("Mountain Lion", "10.8", true),
    j("Mavericks", "10.9", true),
    k("Yosemite", "10.10", true),
    l("El Capitan", "10.11", true),
    m("Sierra", "10.12");

    private String n;
    private String o;
    private boolean p;

    private MacTypes(String var3, String var4) {
        this(var3, var4, false);
    }

    private MacTypes(String var3, String var4, boolean var5) {
        this.n = var3;
        this.o = var4;
        this.p = var5;
    }

    public static MacTypes d() {
        String var0 = System.getProperty("os.version");
        MacTypes[] var4;
        int var3 = (var4 = values()).length;

        for (int var2 = 0; var2 < var3; ++var2) {
            MacTypes var1 = var4[var2];
            if (var0.startsWith(var1.o) || var1.n.toLowerCase().contains(var0.toLowerCase())) {
                return var1;
            }
        }

        return null;
    }

    public final String a() {
        return this.n;
    }

    public final String b() {
        return this.o;
    }

    public final boolean c() {
        return this.p;
    }
}

package osprobe.windows;

public enum WindowsTypes {
    a("Unknown Windows"),
    b("Windows 2000"),
    c("Windows XP"),
    d("Windows 2003"),
    e("Windows Vista"),
    f("Windows Server 2008"),
    g("Windows 7"),
    h("Windows 8.1"),
    i("Windows 8"),
    j("Windows Server 2012"),
    k("Windows 10");

    private String l;

    private WindowsTypes(String var3) {
        this.l = var3;
    }

    public static WindowsTypes b() {
        String var0 = System.getProperty("os.name");
        WindowsTypes[] var4;
        int var3 = (var4 = values()).length;

        for (int var2 = 0; var2 < var3; ++var2) {
            WindowsTypes var1;
            if ((var1 = var4[var2]) != a && var1.l.equalsIgnoreCase(var0)) {
                return var1;
            }
        }

        return a;
    }

    public final String a() {
        return this.l;
    }
}

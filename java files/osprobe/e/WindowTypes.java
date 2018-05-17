package osprobe.e;

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

    // private String l;
    private String name;

    // private b(String var3)
    private WindowsTypes(String name) {
    	// this.l = var3;
        this.name = name;
    }

    public static WindowsTypes b() {
    // public static WindowsTypes findWindowsTypes() {
        // String var0 = System.getProperty("os.name");
        String osName = System.getProperty("os.name");
        // b[] var4;
        WindowsTypes[] types = values();
        // int var3 = (var4 = values()).length;
        int typesCount = types.length;

        // for (int var2 = 0; var2 < var3; ++var2) {
        //     b var1;
        //     if ((var1 = var4[var2]) != a && var1.l.equalsIgnoreCase(var0)) {
        //         return var1;
        //     }
        // }
        for (int i = 0; i < typesCount; ++i) {
        	WindowsType type = types[i];
        	if (type != a && type.name.equalsIgnoreCase(osName)) {
        		return type;
        	}
        }

        return a;
    }

    public final String a() {
    // public final String toString() {
        return this.name;
    }
}

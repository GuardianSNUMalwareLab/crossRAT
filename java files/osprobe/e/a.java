package osprobe.e;

import osprobe.c;

import java.io.Serializable;

public final class a extends osprobe.a implements Serializable {
    // private b a;
    private WindowsTypes a;

    public a() {
        this(WindowsTypes.b(), osprobe.b.a());
        // this(WindowsTypes.findWindowsTypes(), osprobe.ArchitectureTypes.a());
    }

    private a(WindowsTypes var1, osprobe.b var2) {
        super(c.a, var2);
        this.a = var1;
    }

    public final String b() {
        return this.a.a();
    }

    public final String c() {
        return this.a.a();
    }
}

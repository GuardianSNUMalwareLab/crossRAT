package osprobe.linux;

import java.io.Serializable;

public final class d implements Serializable {
    private LinuxTypes a;
    private String b;

    public d(LinuxTypes var1) {
        this.a = var1;
    }

    public final LinuxTypes a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final void a(String var1) {
        this.b = var1;
    }
}

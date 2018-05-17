package osprobe.linux;

import java.io.Serializable;

public final class g extends osprobe.d implements Serializable {
    private d z;

    private g(d var1, osprobe.b var2) {
        super(osprobe.c.c, var2);
        this.z = var1;
    }

    public g() {
        this(LinuxTypes.d(), osprobe.b.a());
    }

    public g(d var1) {
        this(var1, osprobe.b.a());
    }

    public final String b() {
        String var1 = this.z.a().c();
        if (this.z.b() != null) {
            var1 = var1 + " " + this.z.b();
        }

        return var1;
    }
}

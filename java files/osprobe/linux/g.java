package osprobe.linux;

import java.io.Serializable;

public final class g extends a.d implements Serializable {
    private d a;

    private g(d var1, a.b var2) {
        super(a.c.c, var2);
        this.a = var1;
    }

    public g() {
        this(c.d(), a.b.a());
    }

    public g(d var1) {
        this(var1, a.b.a());
    }

    public final String b() {
        String var1 = this.a.a().c();
        if (this.a.b() != null) {
            var1 = var1 + " " + this.a.b();
        }

        return var1;
    }
}

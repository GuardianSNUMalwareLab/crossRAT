package osprobe.c;

import osprobe.d;

import java.io.Serializable;

public final class b extends d implements Serializable {
    private c a;

    public b() {
        this(c.d());
    }

    private b(c var1, a.b var2) {
        super(a.c.b, var2);
        this.a = var1;
    }

    private b(c var1) {
        this(var1, a.b.a());
    }

    public final String b() {
        String var1;
        if (this.a.c()) {
            var1 = "Mac OS X";
        } else {
            var1 = "macOS";
        }

        if (this.a != null) {
            if (this.a.a() != null) {
                var1 = var1 + " " + this.a.a();
            }

            if (this.a.b() != null) {
                var1 = var1 + " " + this.a.b();
            }
        }

        return var1;
    }

    public final String c() {
        return this.b();
    }
}

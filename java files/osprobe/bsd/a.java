package osprobe.bsd;

import osprobe.c;
import osprobe.d;

import java.io.Serializable;

public final class a extends d implements Serializable {
    private b a;

    private a(b var1, osprobe.b var2) {
        super(c.e, var2);
        this.a = var1;
    }

    public a() {
        this(b.b(), osprobe.b.a());
    }

    public a(b var1) {
        this(var1, osprobe.b.a());
    }

    public final String b() {
        return this.a.a();
    }
}

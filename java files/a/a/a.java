package a.a;

import a.c;
import a.d;

import java.io.Serializable;

public final class a extends d implements Serializable {
    private b a;

    private a(b var1, a.b var2) {
        super(c.e, var2);
        this.a = var1;
    }

    public a() {
        this(b.b(), a.b.a());
    }

    public a(b var1) {
        this(var1, a.b.a());
    }

    public final String b() {
        return this.a.a();
    }
}

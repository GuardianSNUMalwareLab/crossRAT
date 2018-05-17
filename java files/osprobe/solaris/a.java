package osprobe.solaris;

import osprobe.b;
import osprobe.c;
import osprobe.d;

import java.io.Serializable;

public final class a extends d implements Serializable {
    public a() {
        this(b.a());
    }

    private a(b var1) {
        super(c.d, var1);
    }

    public final String b() {
        return "Solaris";
    }
}

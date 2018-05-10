package a;

import java.io.Serializable;

// Abstract class that contains an os type.
public abstract class a implements Serializable {
    private c a;

    // a.c: os type, a.b: architecture
    public a(c var1, b var2) {
        this.a = var1;
    }

    // Getter for OS type
    public final c a() {
        return this.a;
    }

    public abstract String b();

    public abstract String c();

    // Check if os is win, mac, linux, or solaris (not bsd or unknown)
    public final boolean d() {
        return this.a == c.e || this.a == c.b || this.a == c.c || this.a == c.d;
    }
}

package osprobe.linux;

import java.io.File;

public final class f extends h {
    private File a;

    public f(String var1) {
        this(new File(var1));
    }

    private f(File var1) {
        this.a = var1;
    }

    public final boolean a() {
        return this.a.exists();
    }
}

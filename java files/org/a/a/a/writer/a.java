package org.a.a.a.writer;

import java.io.Serializable;
import java.io.Writer;

public final class a extends Writer implements Serializable {
    private final StringBuilder a;

    public a() {
        this.a = new StringBuilder();
    }

    public a(int var1) {
        this.a = new StringBuilder(4);
    }

    public final Writer append(char var1) {
        this.a.append(var1);
        return this;
    }

    public final Writer append(CharSequence var1) {
        this.a.append(var1);
        return this;
    }

    public final Writer append(CharSequence var1, int var2, int var3) {
        this.a.append(var1, var2, var3);
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(String var1) {
        if (var1 != null) {
            this.a.append(var1);
        }

    }

    public final void write(char[] var1, int var2, int var3) {
        if (var1 != null) {
            this.a.append(var1, var2, var3);
        }

    }

    public final String toString() {
        return this.a.toString();
    }
}

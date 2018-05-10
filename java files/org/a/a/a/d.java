package org.a.a.a;

import java.io.File;

public final class d {
    private static final char a;

    static {
        Character.toString('.');
        a = File.separatorChar;
    }

    static boolean a() {
        return a == '\\';
    }
}

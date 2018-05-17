package org.a.a.a;

import java.io.File;
import java.io.FileFilter;

final class c implements FileFilter {
    // $FF: synthetic field
    private File a;

    c(File var1) {
        super();
        this.a = var1;
    }

    public final boolean accept(File var1) {
        return var1.equals(this.a);
    }
}

package org.jnativehook.example;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

final class b extends Formatter {
    private b(NativeHookDemo var1) {
    }

    // $FF: synthetic method
    b(NativeHookDemo var1, byte var2) {
        this(var1);
    }

    public final String format(LogRecord var1) {
        StringBuilder var2;
        (var2 = new StringBuilder()).append(new Date(var1.getMillis())).append(" ").append(var1.getLevel().getLocalizedName()).append(":\t").append(this.formatMessage(var1));
        if (var1.getThrown() != null) {
            try {
                StringWriter var3 = new StringWriter();
                PrintWriter var4 = new PrintWriter(var3);
                var1.getThrown().printStackTrace(var4);
                var4.close();
                var2.append(var3.toString());
                var3.close();
            } catch (Exception var5) {
                ;
            }
        }

        return var2.toString();
    }
}

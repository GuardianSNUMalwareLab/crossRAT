package org.a.a.a;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class f {
    private static final boolean a;
    private static Method b;
    private static Method c;
    private static Object d;
    private static Object e;

    static {
        boolean var0 = true;

        try {
            ClassLoader var1;
            Class var2 = (var1 = Thread.currentThread().getContextClassLoader()).loadClass("java.nio.file.Files");
            Class var3 = var1.loadClass("java.nio.file.Path");
            Class var4 = var1.loadClass("java.nio.file.attribute.FileAttribute");
            Class var7 = var1.loadClass("java.nio.file.LinkOption");
            b = var2.getMethod("isSymbolicLink", var3);
            var2.getMethod("delete", var3);
            var2.getMethod("readSymbolicLink", var3);
            e = Array.newInstance(var4, 0);
            var2.getMethod("createSymbolicLink", var3, var3, e.getClass());
            d = Array.newInstance(var7, 0);
            var2.getMethod("exists", var3, d.getClass());
            c = File.class.getMethod("toPath");
            var3.getMethod("toFile");
        } catch (ClassNotFoundException var5) {
            var0 = false;
        } catch (NoSuchMethodException var6) {
            var0 = false;
        }

        a = var0;
    }

    public static boolean a(File var0) {
        try {
            Object var3 = c.invoke(var0);
            return (Boolean) b.invoke((Object) null, var3);
        } catch (IllegalAccessException var1) {
            throw new RuntimeException(var1);
        } catch (InvocationTargetException var2) {
            throw new RuntimeException(var2);
        }
    }

    public static boolean a() {
        return a;
    }
}

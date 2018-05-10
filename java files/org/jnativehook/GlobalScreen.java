package org.jnativehook;

import javax.swing.event.EventListenerList;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

public final class GlobalScreen {
    private static Logger a = Logger.getLogger(GlobalScreen.class.getPackage().getName());
    private static GlobalScreen$NativeHookThread b;
    private static ExecutorService c = new a();
    private static EventListenerList d = new EventListenerList();

    static {
        String var0 = System.getProperty("jnativehook.lib.name", "JNativeHook");

        try {
            System.loadLibrary(var0);
        } catch (UnsatisfiedLinkError var3) {
            var0 = System.getProperty("jnativehook.lib.locator", "org.jnativehook.DefaultLibraryLocator");

            try {
                Iterator var4 = ((d) Class.forName(var0).asSubclass(d.class).newInstance()).a();

                while (var4.hasNext()) {
                    File var1;
                    if ((var1 = (File) var4.next()).exists() && var1.isFile() && var1.canRead()) {
                        System.load(var1.getPath());
                    }
                }

            } catch (Exception var2) {
                a.severe(var2.getMessage());
                throw new UnsatisfiedLinkError(var2.getMessage());
            }
        }
    }

    public static void a(org.jnativehook.a.a var0) {
        if (var0 != null) {
            d.add(org.jnativehook.a.a.class, var0);
        }

    }

    public static void b(org.jnativehook.a.a var0) {
        if (var0 != null) {
            d.remove(org.jnativehook.a.a.class, var0);
        }

    }

    public static void a(org.jnativehook.b.b var0) {
        if (var0 != null) {
            d.add(org.jnativehook.b.b.class, var0);
        }

    }

    public static void b(org.jnativehook.b.b var0) {
        if (var0 != null) {
            d.remove(org.jnativehook.b.b.class, var0);
        }

    }

    public static void a(org.jnativehook.b.c var0) {
        if (var0 != null) {
            d.add(org.jnativehook.b.c.class, var0);
        }

    }

    public static void b(org.jnativehook.b.c var0) {
        if (var0 != null) {
            d.remove(org.jnativehook.b.c.class, var0);
        }

    }

    public static void a(org.jnativehook.b.d var0) {
        if (var0 != null) {
            d.add(org.jnativehook.b.d.class, var0);
        }

    }

    public static void b(org.jnativehook.b.d var0) {
        if (var0 != null) {
            d.remove(org.jnativehook.b.d.class, var0);
        }

    }

    public static void a() {
        if (b == null || !b.isAlive()) {
            synchronized (b = new GlobalScreen$NativeHookThread()) {
                b.start();

                try {
                    b.wait();
                } catch (InterruptedException var2) {
                    throw new c(var2);
                }

                c var1;
                if ((var1 = b.a()) != null) {
                    throw var1;
                }
            }
        }
    }

    public static void b() {
        if (c()) {
            GlobalScreen$NativeHookThread var0 = b;
            synchronized (b) {
                b.disable();

                try {
                    b.join();
                } catch (InterruptedException var2) {
                    throw new c(var2.getCause());
                }

            }
        }
    }

    public static boolean c() {
        return b != null && b.isAlive();
    }

    public static void a(ExecutorService var0) {
        if (c != null) {
            c.shutdown();
        }

        c = var0;
    }
}

package org.jnativehook;

import java.util.concurrent.ThreadFactory;

final class b implements ThreadFactory {
    public final Thread newThread(Runnable var1) {
        Thread var2;
        (var2 = new Thread(var1)).setName("JNativeHook Dispatch Thread");
        var2.setDaemon(true);
        return var2;
    }
}

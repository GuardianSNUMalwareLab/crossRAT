package org.jnativehook;

class GlobalScreen$NativeHookThread extends Thread {
    private c a;

    public GlobalScreen$NativeHookThread() {
        this.setName("JNativeHook Hook Thread");
        this.setDaemon(false);
        this.setPriority(10);
    }

    public void run() {
        this.a = null;

        try {
            this.enable();
        } catch (c var4) {
            this.a = var4;
        }

        synchronized (this) {
            this.notifyAll();
        }
    }

    public final c a() {
        return this.a;
    }

    private native void enable();

    public native void disable();
}

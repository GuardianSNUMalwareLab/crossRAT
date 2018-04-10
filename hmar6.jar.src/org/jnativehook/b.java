package org.jnativehook;

import java.util.concurrent.ThreadFactory;

final class b
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    (paramRunnable = new Thread(paramRunnable)).setName("JNativeHook Dispatch Thread");
    paramRunnable.setDaemon(true);
    return paramRunnable;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
package org.jnativehook;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public final class e
  extends AbstractExecutorService
{
  private boolean a = false;
  
  public final void shutdown()
  {
    this.a = false;
  }
  
  public final List shutdownNow()
  {
    this.a = false;
    return new ArrayList(0);
  }
  
  public final boolean isShutdown()
  {
    return !this.a;
  }
  
  public final boolean isTerminated()
  {
    return !this.a;
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    return true;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    EventQueue.invokeLater(paramRunnable);
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
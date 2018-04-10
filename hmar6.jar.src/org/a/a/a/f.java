package org.a.a.a;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class f
{
  private static final boolean a;
  private static Method b;
  private static Method c;
  private static Object d;
  private static Object e;
  
  public static boolean a(File paramFile)
  {
    try
    {
      paramFile = c.invoke(paramFile, new Object[0]);
      return (paramFile = (Boolean)b.invoke(null, new Object[] { paramFile })).booleanValue();
    }
    catch (IllegalAccessException paramFile)
    {
      throw new RuntimeException(paramFile);
    }
    catch (InvocationTargetException paramFile)
    {
      throw new RuntimeException(paramFile);
    }
  }
  
  public static boolean a()
  {
    return a;
  }
  
  static
  {
    boolean bool = true;
    try
    {
      Class localClass1 = (localObject = Thread.currentThread().getContextClassLoader()).loadClass("java.nio.file.Files");
      Class localClass2 = ((ClassLoader)localObject).loadClass("java.nio.file.Path");
      Class localClass3 = ((ClassLoader)localObject).loadClass("java.nio.file.attribute.FileAttribute");
      Object localObject = ((ClassLoader)localObject).loadClass("java.nio.file.LinkOption");
      b = localClass1.getMethod("isSymbolicLink", new Class[] { localClass2 });
      localClass1.getMethod("delete", new Class[] { localClass2 });
      localClass1.getMethod("readSymbolicLink", new Class[] { localClass2 });
      e = Array.newInstance(localClass3, 0);
      localClass1.getMethod("createSymbolicLink", new Class[] { localClass2, localClass2, e.getClass() });
      d = Array.newInstance((Class)localObject, 0);
      localClass1.getMethod("exists", new Class[] { localClass2, d.getClass() });
      c = File.class.getMethod("toPath", new Class[0]);
      localClass2.getMethod("toFile", new Class[0]);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      bool = false;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      bool = false;
    }
    a = bool;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\a\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
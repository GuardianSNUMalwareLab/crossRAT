package a.c;

import a.c;
import crossrat.e;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static boolean a(boolean paramBoolean)
  {
    Object localObject = new File("/usr/bin/sw_vers");
    try
    {
      Iterator localIterator = (localObject = e.a((File)localObject)).iterator();
      while (localIterator.hasNext()) {
        if ((localObject = (String)localIterator.next()).contains(c.b.a())) {
          return true;
        }
      }
    }
    catch (Exception localException)
    {
      (localObject = localException).printStackTrace();
    }
    if (paramBoolean) {
      return ((localObject = System.getProperty("os.name").toLowerCase()).contains("mac os x")) || (((String)localObject).contains("macos"));
    }
    return false;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
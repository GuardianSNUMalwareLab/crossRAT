package a.c;

import a.d;
import java.io.Serializable;

public final class b
  extends d
  implements Serializable
{
  private c a;
  
  public b()
  {
    this(c.d());
  }
  
  private b(c paramc, a.b paramb)
  {
    super(a.c.b, paramb);
    this.a = paramc;
  }
  
  private b(c paramc)
  {
    this(paramc, a.b.a());
  }
  
  public final String b()
  {
    String str;
    if (this.a.c()) {
      str = "Mac OS X";
    } else {
      str = "macOS";
    }
    if (this.a != null)
    {
      if (this.a.a() != null) {
        str = str + " " + this.a.a();
      }
      if (this.a.b() != null) {
        str = str + " " + this.a.b();
      }
    }
    return str;
  }
  
  public final String c()
  {
    return b();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
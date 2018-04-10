package a.e;

public enum b
{
  private String l;
  
  private b(String paramString1)
  {
    this.l = paramString1;
  }
  
  public final String a()
  {
    return this.l;
  }
  
  public static b b()
  {
    String str = System.getProperty("os.name");
    b[] arrayOfb;
    int i1 = (arrayOfb = values()).length;
    for (int n = 0; n < i1; n++)
    {
      b localb1;
      b localb2;
      if (((localb1 = arrayOfb[n]) != a) && ((localb2 = localb1).l.equalsIgnoreCase(str))) {
        return localb1;
      }
    }
    return a;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
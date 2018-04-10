package a.c;

public enum c
{
  private String n;
  private String o;
  private boolean p;
  
  private c(String paramString2, String paramString3)
  {
    this(paramString2, paramString3, false);
  }
  
  private c(String paramString2, String paramString3, boolean paramBoolean)
  {
    this.n = paramString2;
    this.o = paramString3;
    this.p = paramBoolean;
  }
  
  public final String a()
  {
    return this.n;
  }
  
  public final String b()
  {
    return this.o;
  }
  
  public final boolean c()
  {
    return this.p;
  }
  
  public static c d()
  {
    String str = System.getProperty("os.version");
    c[] arrayOfc;
    int i2 = (arrayOfc = values()).length;
    for (int i1 = 0; i1 < i2; i1++)
    {
      c localc1 = arrayOfc[i1];
      c localc2;
      if ((str.startsWith((localc2 = localc1).o)) || ((localc2 = localc1).n.toLowerCase().contains(str.toLowerCase()))) {
        return localc1;
      }
    }
    return null;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
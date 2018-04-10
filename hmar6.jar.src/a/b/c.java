package a.b;

public enum c
{
  private String X;
  private Object[] Y;
  
  private c(String paramString1, Object... paramVarArgs)
  {
    this.X = paramString1;
    this.Y = paramVarArgs;
  }
  
  public final Object[] a()
  {
    return this.Y;
  }
  
  public final String b()
  {
    return this.X;
  }
  
  public final String c()
  {
    if (this == d) {
      return "Unknown Linux";
    }
    if (!this.X.toLowerCase().contains("linux")) {
      return this.X + " Linux";
    }
    return this.X;
  }
  
  public static d d()
  {
    return crossrat.e.d();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package a.b;

import java.io.File;

public final class f
  extends h
{
  private File a;
  
  public f(String paramString)
  {
    this(new File(paramString));
  }
  
  private f(File paramFile)
  {
    this.a = paramFile;
  }
  
  public final boolean a()
  {
    return this.a.exists();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
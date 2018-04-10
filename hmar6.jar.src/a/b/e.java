package a.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class e
  extends h
{
  private File a;
  private String b;
  
  public e(String paramString1, String paramString2)
  {
    this(new File(paramString1), paramString2);
  }
  
  private e(File paramFile, String paramString)
  {
    this.a = paramFile;
    this.b = paramString;
  }
  
  public final boolean a()
  {
    if (this.a.exists()) {
      try
      {
        localObject = new BufferedReader(new InputStreamReader(new FileInputStream(this.a)));
        String str;
        while ((str = ((BufferedReader)localObject).readLine()) != null) {
          if (str.toLowerCase().contains(this.b.toLowerCase()))
          {
            ((BufferedReader)localObject).close();
            return true;
          }
        }
        ((BufferedReader)localObject).close();
      }
      catch (Exception localException)
      {
        Object localObject;
        (localObject = localException).printStackTrace();
      }
    }
    return false;
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
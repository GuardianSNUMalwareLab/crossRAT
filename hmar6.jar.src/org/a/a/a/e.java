package org.a.a.a;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import org.a.a.a.a.a;

public final class e
{
  public static void a(Closeable... paramVarArgs)
  {
    paramVarArgs = paramVarArgs;
    for (int i = 0; i < 4; i++)
    {
      Closeable localCloseable = localCloseable = paramVarArgs[i];
      try
      {
        if (localCloseable != null) {
          localCloseable.close();
        }
      }
      catch (IOException localIOException) {}
    }
  }
  
  static
  {
    Object localObject = new a(4);
    (localObject = new PrintWriter((Writer)localObject)).println();
    ((PrintWriter)localObject).close();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\a\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
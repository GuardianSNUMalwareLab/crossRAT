package org.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public final class e {
   public static void a(Closeable... var0) {
      var0 = var0;

      for(int var1 = 0; var1 < 4; ++var1) {
         Closeable var2 = var0[var1];

         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var3) {
            ;
         }
      }

   }

   static {
      char var10000 = File.separatorChar;
      org.a.a.a.a.a var0 = new org.a.a.a.a.a(4);
      PrintWriter var1;
      (var1 = new PrintWriter(var0)).println();
      var1.close();
   }
}

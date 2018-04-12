package b;

// Abstract class implemented by the platform-specific persistent code.
public abstract class a {
   // Whether to call the executable with 'java -jar' or just run it directly.
   protected boolean a;
   // What to name the .desktop file/.plist file/etc.
   protected String b;
   // Location of the binary to be executed on boot/login.
   protected String c;

   public a(String var1, String var2, boolean var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   // Implemented by platform-specific code.
   public abstract void a();
}

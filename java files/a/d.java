package a;

// An additional abstraction over a, adds an optional string that has a default value.
public abstract class d extends a {
   private String a;

   public d(c var1, b var2) {
      super(var1, var2);
   }

   public String c() {
      return this.a == null ? this.b() : this.a;
   }

   public final void a(String var1) {
      this.a = var1;
   }
}

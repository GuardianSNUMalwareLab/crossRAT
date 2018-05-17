package osprobe.linux;

public final class b extends h {
    private String a;

    public b(String var1) {
        this.a = var1;
    }

    public final boolean a() {
        try {
            crossrat.e.a(new String[]{this.a});
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
}

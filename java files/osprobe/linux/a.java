package osprobe.linux;

import java.util.Iterator;

public final class a extends h {
    private String[] a;
    private String b;

    public a(String[] var1, String var2) {
        this.a = var1;
        this.b = var2;
    }

    public final boolean a() {
        try {
            Iterator var2 = crossrat.e.a(this.a).iterator();

            while (var2.hasNext()) {
                if (((String) var2.next()).toLowerCase().contains(this.b.toLowerCase())) {
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return false;
    }
}

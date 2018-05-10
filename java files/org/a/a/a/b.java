package org.a.a.a;

import java.io.*;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public final class b {
    private static BigInteger a;
    private static BigInteger b;
    private static BigInteger c;
    private static BigInteger d;
    private static BigInteger e;
    private static BigInteger f;

    static {
        b = (a = BigInteger.valueOf(1024L)).multiply(a);
        c = a.multiply(b);
        d = a.multiply(c);
        e = a.multiply(d);
        a.multiply(e);
        f = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        a.multiply(f);
    }

    public static void a(File var0, File var1) {
        File var10000 = var0;
        boolean var3 = true;
        var0 = var10000;
        d(var10000, var1);    // same to d(var0, var1);
        if (var0.isDirectory()) {
            throw new IOException("Source '" + var0 + "' exists but is a directory");
        } else if (var0.getCanonicalPath().equals(var1.getCanonicalPath())) {
            throw new IOException("Source '" + var0 + "' and destination '" + var1 + "' are the same");
        } else {
            File var2;
            if ((var2 = var1.getParentFile()) != null && !var2.mkdirs() && !var2.isDirectory()) {
                throw new IOException("Destination '" + var2 + "' directory cannot be created");
            } else if (var1.exists() && !var1.canWrite()) {
                throw new IOException("Destination '" + var1 + "' exists but is read-only");
            } else {
                a(var0, var1, true);    // 밑에 보이는 a(File, File, boolean) 메소드를 부른다. 난독화 실화?
            }
        }
    }

    // var0의 내용을 var1에다가 복사한다 (????) 아마도 (??????)
    private static void a(File var0, File var1, boolean var2) {
        if (var1.exists() && var1.isDirectory()) {
            throw new IOException("Destination '" + var1 + "' exists but is a directory");
        } else {
            FileInputStream var3 = null;
            FileOutputStream var4 = null;
            FileChannel var5 = null;
            FileChannel var6 = null;

            long var7;
            long var9;
            try {
                var3 = new FileInputStream(var0);
                var4 = new FileOutputStream(var1);
                var5 = var3.getChannel();
                var6 = var4.getChannel();
                var7 = var5.size();

                long var15;
                for (var9 = 0L; var9 < var7; var9 += var15) {
                    long var13;
                    long var11 = (var13 = var7 - var9) > 31457280L ? 31457280L : var13;
                    if ((var15 = var6.transferFrom(var5, var9, var11)) == 0L) {
                        break;
                    }
                }
            } finally {
                org.a.a.a.e.a(var6, var4, var5, var3);
            }

            var7 = var0.length();
            var9 = var1.length();
            if (var7 != var9) {
                throw new IOException("Failed to copy full contents from '" + var0 + "' to '" + var1 + "' Expected length: " + var7 + " Actual: " + var9);
            } else {
                if (var2) {
                    var1.setLastModified(var0.lastModified());
                }

            }
        }
    }

    private static void c(File var0, File var1) {
        File var10000 = var0;
        boolean var8 = true;
        boolean var2 = true;
        var0 = null;
        var1 = var1;
        var0 = var10000;
        d(var10000, var1);
        if (!var0.isDirectory()) {
            throw new IOException("Source '" + var0 + "' exists but is not a directory");
        } else if (var0.getCanonicalPath().equals(var1.getCanonicalPath())) {
            throw new IOException("Source '" + var0 + "' and destination '" + var1 + "' are the same");
        } else {
            ArrayList var3 = null;
            File[] var4;
            if (var1.getCanonicalPath().startsWith(var0.getCanonicalPath()) && (var4 = var0.listFiles()) != null && var4.length > 0) {
                var3 = new ArrayList(var4.length);
                int var5 = (var4 = var4).length;

                for (int var6 = 0; var6 < var5; ++var6) {
                    File var7 = var4[var6];
                    var7 = new File(var1, var7.getName());
                    var3.add(var7.getCanonicalPath());
                }
            }

            a(var0, var1, (FileFilter) null, var2, var3);
        }
    }

    private static void d(File var0, File var1) {
        if (var0 == null) {
            throw new NullPointerException("Source must not be null");
        } else if (var1 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!var0.exists()) {
            throw new FileNotFoundException("Source '" + var0 + "' does not exist");
        }
    }

    private static void a(File var0, File var1, FileFilter var2, boolean var3, List var4) {
        File[] var5;
        if ((var5 = var2 == null ? var0.listFiles() : var0.listFiles(var2)) == null) {
            throw new IOException("Failed to list contents of " + var0);
        } else {
            if (var1.exists()) {
                if (!var1.isDirectory()) {
                    throw new IOException("Destination '" + var1 + "' exists but is not a directory");
                }
            } else if (!var1.mkdirs() && !var1.isDirectory()) {
                throw new IOException("Destination '" + var1 + "' directory cannot be created");
            }

            if (!var1.canWrite()) {
                throw new IOException("Destination '" + var1 + "' cannot be written to");
            } else {
                int var6 = (var5 = var5).length;

                for (int var7 = 0; var7 < var6; ++var7) {
                    File var8 = var5[var7];
                    File var9 = new File(var1, var8.getName());
                    if (var4 == null || !var4.contains(var8.getCanonicalPath())) {
                        if (var8.isDirectory()) {
                            a(var8, var9, var2, var3, var4);
                        } else {
                            a(var8, var9, var3);
                        }
                    }
                }

                if (var3) {
                    var1.setLastModified(var0.lastModified());
                }

            }
        }
    }

    private static void b(File var0) {
        if (var0.exists()) {
            boolean var10000;
            if (org.a.a.a.f.a()) {
                var10000 = org.a.a.a.f.a(var0);
            } else {
                if (var0 == null) {
                    throw new NullPointerException("File must not be null");
                }

                if (org.a.a.a.d.a()) {
                    var10000 = false;
                } else {
                    File var2;
                    if (var0.getParent() == null) {
                        var2 = var0;
                    } else {
                        var2 = var0.getParentFile().getCanonicalFile();
                        var2 = new File(var2, var0.getName());
                    }

                    if (var2.getCanonicalFile().equals(var2.getAbsoluteFile())) {
                        label59:
                        {
                            if (!var0.exists()) {
                                File var1;
                                if ((var2 = (var1 = var0.getCanonicalFile()).getParentFile()) == null || !var2.exists()) {
                                    var10000 = false;
                                    break label59;
                                }

                                File[] var4;
                                if ((var4 = var2.listFiles(new c(var1))) != null && var4.length > 0) {
                                    var10000 = true;
                                    break label59;
                                }
                            }

                            var10000 = false;
                        }
                    } else {
                        var10000 = true;
                    }
                }
            }

            if (!var10000) {
                c(var0);
            }

            if (!var0.delete()) {
                String var3 = "Unable to delete directory " + var0 + ".";
                throw new IOException(var3);
            }
        }
    }

    public static boolean a(File var0) {
        try {
            if (var0.isDirectory()) {
                c(var0);
            }
        } catch (Exception var2) {
            ;
        }

        try {
            return var0.delete();
        } catch (Exception var1) {
            return false;
        }
    }

    private static void c(File var0) {
        String var10;
        if (!var0.exists()) {
            var10 = var0 + " does not exist";
            throw new IllegalArgumentException(var10);
        } else if (!var0.isDirectory()) {
            var10 = var0 + " is not a directory";
            throw new IllegalArgumentException(var10);
        } else {
            File[] var5;
            if ((var5 = var0.listFiles()) == null) {
                throw new IOException("Failed to list contents of " + var0);
            } else {
                IOException var1 = null;
                File[] var7 = var5;
                int var2 = var5.length;

                for (int var3 = 0; var3 < var2; ++var3) {
                    File var4 = var7[var3];

                    try {
                        if (var4.isDirectory()) {
                            b(var4);
                        } else {
                            boolean var9 = var4.exists();
                            if (!var4.delete()) {
                                if (!var9) {
                                    throw new FileNotFoundException("File does not exist: " + var4);
                                }

                                String var8 = "Unable to delete file: " + var4;
                                throw new IOException(var8);
                            }
                        }
                    } catch (IOException var6) {
                        var1 = var6;
                    }
                }

                if (var1 != null) {
                    throw var1;
                }
            }
        }
    }

    public static void b(File var0, File var1) {
        if (!var0.exists()) {
            throw new FileNotFoundException("Source '" + var0 + "' does not exist");
        } else if (!var0.isDirectory()) {
            throw new IOException("Source '" + var0 + "' is not a directory");
        } else if (var1.exists()) {
            throw new a("Destination '" + var1 + "' already exists");
        } else {
            if (!var0.renameTo(var1)) {
                if (var1.getCanonicalPath().startsWith(var0.getCanonicalPath() + File.separator)) {
                    throw new IOException("Cannot move directory: " + var0 + " to a subdirectory of itself: " + var1);
                }

                c(var0, var1);
                b(var0);
                if (var0.exists()) {
                    throw new IOException("Failed to delete original directory '" + var0 + "' after copy to '" + var1 + "'");
                }
            }

        }
    }
}

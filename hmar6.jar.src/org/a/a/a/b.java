package org.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static BigInteger a;
  private static BigInteger b = (a = BigInteger.valueOf(1024L)).multiply(a);
  private static BigInteger c = a.multiply(b);
  private static BigInteger d = a.multiply(c);
  private static BigInteger e = a.multiply(d);
  private static BigInteger f;
  
  public static void a(File paramFile1, File paramFile2)
  {
    paramFile1 = 1;
    paramFile2 = paramFile2;
    paramFile1 = paramFile1;
    d(paramFile1, paramFile2);
    if (paramFile1.isDirectory()) {
      throw new IOException("Source '" + paramFile1 + "' exists but is a directory");
    }
    if (paramFile1.getCanonicalPath().equals(paramFile2.getCanonicalPath())) {
      throw new IOException("Source '" + paramFile1 + "' and destination '" + paramFile2 + "' are the same");
    }
    File localFile;
    if (((localFile = paramFile2.getParentFile()) != null) && (!localFile.mkdirs()) && (!localFile.isDirectory())) {
      throw new IOException("Destination '" + localFile + "' directory cannot be created");
    }
    if ((paramFile2.exists()) && (!paramFile2.canWrite())) {
      throw new IOException("Destination '" + paramFile2 + "' exists but is read-only");
    }
    a(paramFile1, paramFile2, true);
  }
  
  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if ((paramFile2.exists()) && (paramFile2.isDirectory())) {
      throw new IOException("Destination '" + paramFile2 + "' exists but is a directory");
    }
    FileInputStream localFileInputStream = null;
    FileOutputStream localFileOutputStream = null;
    FileChannel localFileChannel1 = null;
    FileChannel localFileChannel2 = null;
    try
    {
      localFileInputStream = new FileInputStream(paramFile1);
      localFileOutputStream = new FileOutputStream(paramFile2);
      localFileChannel1 = localFileInputStream.getChannel();
      localFileChannel2 = localFileOutputStream.getChannel();
      l1 = localFileChannel1.size();
      long l5;
      for (l2 = 0L; l2 < l1; l2 += l5)
      {
        long l4;
        long l3 = (l4 = l1 - l2) > 31457280L ? 31457280L : l4;
        if ((l5 = localFileChannel2.transferFrom(localFileChannel1, l2, l3)) == 0L) {
          break;
        }
      }
      e.a(new Closeable[] { localFileChannel2, localFileOutputStream, localFileChannel1, localFileInputStream });
    }
    finally
    {
      e.a(new Closeable[] { localFileChannel2, localFileOutputStream, localFileChannel1, localFileInputStream });
    }
    long l1 = paramFile1.length();
    long l2 = paramFile2.length();
    if (l1 != l2) {
      throw new IOException("Failed to copy full contents from '" + paramFile1 + "' to '" + paramFile2 + "' Expected length: " + l1 + " Actual: " + l2);
    }
    if (paramBoolean) {
      paramFile2.setLastModified(paramFile1.lastModified());
    }
  }
  
  private static void c(File paramFile1, File paramFile2)
  {
    paramFile1 = 1;
    paramFile2 = paramFile2;
    paramFile1 = paramFile1;
    boolean bool = true;
    paramFile1 = null;
    paramFile2 = paramFile2;
    paramFile1 = paramFile1;
    d(paramFile1, paramFile2);
    if (!paramFile1.isDirectory()) {
      throw new IOException("Source '" + paramFile1 + "' exists but is not a directory");
    }
    if (paramFile1.getCanonicalPath().equals(paramFile2.getCanonicalPath())) {
      throw new IOException("Source '" + paramFile1 + "' and destination '" + paramFile2 + "' are the same");
    }
    ArrayList localArrayList = null;
    File[] arrayOfFile;
    if ((paramFile2.getCanonicalPath().startsWith(paramFile1.getCanonicalPath())) && ((arrayOfFile = paramFile1.listFiles()) != null) && (arrayOfFile.length > 0))
    {
      localArrayList = new ArrayList(arrayOfFile.length);
      int i = (arrayOfFile = arrayOfFile).length;
      for (int j = 0; j < i; j++)
      {
        File localFile = arrayOfFile[j];
        localFile = new File(paramFile2, localFile.getName());
        localArrayList.add(localFile.getCanonicalPath());
      }
    }
    a(paramFile1, paramFile2, null, bool, localArrayList);
  }
  
  private static void d(File paramFile1, File paramFile2)
  {
    if (paramFile1 == null) {
      throw new NullPointerException("Source must not be null");
    }
    if (paramFile2 == null) {
      throw new NullPointerException("Destination must not be null");
    }
    if (!paramFile1.exists()) {
      throw new FileNotFoundException("Source '" + paramFile1 + "' does not exist");
    }
  }
  
  private static void a(File paramFile1, File paramFile2, FileFilter paramFileFilter, boolean paramBoolean, List paramList)
  {
    File[] arrayOfFile;
    if ((arrayOfFile = paramFileFilter == null ? paramFile1.listFiles() : paramFile1.listFiles(paramFileFilter)) == null) {
      throw new IOException("Failed to list contents of " + paramFile1);
    }
    if (paramFile2.exists())
    {
      if (!paramFile2.isDirectory()) {
        throw new IOException("Destination '" + paramFile2 + "' exists but is not a directory");
      }
    }
    else if ((!paramFile2.mkdirs()) && (!paramFile2.isDirectory())) {
      throw new IOException("Destination '" + paramFile2 + "' directory cannot be created");
    }
    if (!paramFile2.canWrite()) {
      throw new IOException("Destination '" + paramFile2 + "' cannot be written to");
    }
    int i = (arrayOfFile = arrayOfFile).length;
    for (int j = 0; j < i; j++)
    {
      File localFile1 = arrayOfFile[j];
      File localFile2 = new File(paramFile2, localFile1.getName());
      if ((paramList == null) || (!paramList.contains(localFile1.getCanonicalPath()))) {
        if (localFile1.isDirectory()) {
          a(localFile1, localFile2, paramFileFilter, paramBoolean, paramList);
        } else {
          a(localFile1, localFile2, paramBoolean);
        }
      }
    }
    if (paramBoolean) {
      paramFile2.setLastModified(paramFile1.lastModified());
    }
  }
  
  private static void b(File paramFile)
  {
    if (!paramFile.exists()) {
      return;
    }
    Object localObject1 = paramFile;
    if (localObject1 == null) {
      throw new NullPointerException("File must not be null");
    }
    Object localObject2;
    if (((File)localObject1).getParent() == null)
    {
      localObject2 = localObject1;
    }
    else
    {
      localObject2 = ((File)localObject1).getParentFile().getCanonicalFile();
      localObject2 = new File((File)localObject2, ((File)localObject1).getName());
    }
    if (!(localObject1 = localObject1).exists()) {}
    if ((((File)localObject2).getCanonicalFile().equals(((File)localObject2).getAbsoluteFile()) ? 0 : ((localObject1 = ((File)localObject2).listFiles(new c((File)localObject1))) != null) && (localObject1.length > 0) ? 1 : ((localObject2 = (localObject1 = ((File)localObject1).getCanonicalFile()).getParentFile()) == null) || (!((File)localObject2).exists()) ? 0 : d.a() ? 0 : f.a() ? f.a((File)localObject1) : 1) == 0) {
      c(paramFile);
    }
    if (!paramFile.delete())
    {
      paramFile = "Unable to delete directory " + paramFile + ".";
      throw new IOException(paramFile);
    }
  }
  
  public static boolean a(File paramFile)
  {
    try
    {
      if (paramFile.isDirectory()) {
        c(paramFile);
      }
    }
    catch (Exception localException1) {}
    try
    {
      return paramFile.delete();
    }
    catch (Exception localException2) {}
    return false;
  }
  
  private static void c(File paramFile)
  {
    File localFile = paramFile;
    Object localObject2;
    if (!paramFile.exists())
    {
      localObject2 = localFile + " does not exist";
      throw new IllegalArgumentException((String)localObject2);
    }
    if (!localFile.isDirectory())
    {
      localObject2 = localFile + " is not a directory";
      throw new IllegalArgumentException((String)localObject2);
    }
    if ((localObject2 = localFile.listFiles()) == null) {
      throw new IOException("Failed to list contents of " + localFile);
    }
    paramFile = (File)localObject2;
    Object localObject1 = null;
    for (localFile : paramFile) {
      try
      {
        if ((localFile = localFile).isDirectory())
        {
          b(localFile);
        }
        else
        {
          boolean bool = localFile.exists();
          if (!localFile.delete())
          {
            if (!bool) {
              throw new FileNotFoundException("File does not exist: " + localFile);
            }
            localObject1 = "Unable to delete file: " + localFile;
            throw new IOException((String)localObject1);
          }
        }
      }
      catch (IOException localIOException)
      {
        localObject1 = localObject1 = localIOException;
      }
    }
    if (localObject1 != null) {
      throw ((Throwable)localObject1);
    }
  }
  
  public static void b(File paramFile1, File paramFile2)
  {
    if (!paramFile1.exists()) {
      throw new FileNotFoundException("Source '" + paramFile1 + "' does not exist");
    }
    if (!paramFile1.isDirectory()) {
      throw new IOException("Source '" + paramFile1 + "' is not a directory");
    }
    if (paramFile2.exists()) {
      throw new a("Destination '" + paramFile2 + "' already exists");
    }
    boolean bool;
    if (!(bool = paramFile1.renameTo(paramFile2)))
    {
      if (paramFile2.getCanonicalPath().startsWith(paramFile1.getCanonicalPath() + File.separator)) {
        throw new IOException("Cannot move directory: " + paramFile1 + " to a subdirectory of itself: " + paramFile2);
      }
      c(paramFile1, paramFile2);
      b(paramFile1);
      if (paramFile1.exists()) {
        throw new IOException("Failed to delete original directory '" + paramFile1 + "' after copy to '" + paramFile2 + "'");
      }
    }
  }
  
  static
  {
    a.multiply(e);
    f = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
    a.multiply(f);
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
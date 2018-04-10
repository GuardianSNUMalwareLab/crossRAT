package org.a.a.a.a;

import java.io.Serializable;
import java.io.Writer;

public final class a
  extends Writer
  implements Serializable
{
  private final StringBuilder a;
  
  public a()
  {
    this.a = new StringBuilder();
  }
  
  public a(int paramInt)
  {
    this.a = new StringBuilder(4);
  }
  
  public final Writer append(char paramChar)
  {
    this.a.append(paramChar);
    return this;
  }
  
  public final Writer append(CharSequence paramCharSequence)
  {
    this.a.append(paramCharSequence);
    return this;
  }
  
  public final Writer append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    this.a.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final void close() {}
  
  public final void flush() {}
  
  public final void write(String paramString)
  {
    if (paramString != null) {
      this.a.append(paramString);
    }
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfChar != null) {
      this.a.append(paramArrayOfChar, paramInt1, paramInt2);
    }
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
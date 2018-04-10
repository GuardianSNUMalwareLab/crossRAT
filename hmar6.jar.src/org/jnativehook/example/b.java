package org.jnativehook.example;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

final class b
  extends Formatter
{
  private b(NativeHookDemo paramNativeHookDemo) {}
  
  public final String format(LogRecord paramLogRecord)
  {
    StringBuilder localStringBuilder;
    (localStringBuilder = new StringBuilder()).append(new Date(paramLogRecord.getMillis())).append(" ").append(paramLogRecord.getLevel().getLocalizedName()).append(":\t").append(formatMessage(paramLogRecord));
    if (paramLogRecord.getThrown() != null) {
      try
      {
        StringWriter localStringWriter = new StringWriter();
        PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
        paramLogRecord.getThrown().printStackTrace(localPrintWriter);
        localPrintWriter.close();
        localStringBuilder.append(localStringWriter.toString());
        localStringWriter.close();
      }
      catch (Exception localException) {}
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\example\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
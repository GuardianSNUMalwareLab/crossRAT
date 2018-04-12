package org.jnativehook;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public final class e extends AbstractExecutorService {
   private boolean a = false;

   public e() {
      this.a = true;
   }

   public final void shutdown() {
      this.a = false;
   }

   public final List shutdownNow() {
      this.a = false;
      return new ArrayList(0);
   }

   public final boolean isShutdown() {
      return !this.a;
   }

   public final boolean isTerminated() {
      return !this.a;
   }

   public final boolean awaitTermination(long var1, TimeUnit var3) {
      return true;
   }

   public final void execute(Runnable var1) {
      EventQueue.invokeLater(var1);
   }
}

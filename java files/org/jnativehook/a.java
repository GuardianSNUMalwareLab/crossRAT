package org.jnativehook;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a extends ThreadPoolExecutor {
    public a() {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b());
    }
}

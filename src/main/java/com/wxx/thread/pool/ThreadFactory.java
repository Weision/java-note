package com.wxx.thread.pool;

/**
 * 线程创建工厂
 */
@FunctionalInterface
public interface ThreadFactory {
    Thread createThread(Runnable runnable);
}

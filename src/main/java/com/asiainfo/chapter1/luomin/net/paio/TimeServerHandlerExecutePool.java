package com.asiainfo.chapter1.luomin.net.paio;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 处理TimeServer连接任务的线程池
 * 内部有消息队列
 *
 */
public class TimeServerHandlerExecutePool {

    private ExecutorService executor;    //线程池

    //构造函数初始化线程池
    public TimeServerHandlerExecutePool(int maxPoolSize, int queueSize) {
        executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                maxPoolSize, 120L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize));
    }

    //执行任务
    public void execute(Runnable task) {
        executor.execute(task);
    }
}
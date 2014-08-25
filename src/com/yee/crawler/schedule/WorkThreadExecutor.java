package com.yee.crawler.schedule;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: Roger.Yee
 * Date: 8/25/14
 * Time: 5:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkThreadExecutor implements Runnable
{
    private Executor executorService;
    private int threadNumber;
    private Queue workThreadQueue;

    public WorkThreadExecutor(int threadNumber)
    {
        this.threadNumber = threadNumber;
        this.executorService = Executors.newFixedThreadPool(threadNumber);
        this.workThreadQueue = new ConcurrentLinkedQueue();
    }

    public void addWorkThread(WorkThread workThread)
    {
        if(workThread == null) return;
        this.workThreadQueue.add(workThread);
    }

    @Override
    public void run()
    {
        //TODO
    }
}

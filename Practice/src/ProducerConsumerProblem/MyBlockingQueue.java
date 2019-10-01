package ProducerConsumerProblem;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
    private Queue<E> queue;
    private int max;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size){
        this.queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) throws InterruptedException {
        lock.lock();
        try {
            if(queue.size() == max){
                notFull.wait();
            }
            queue.add(e);
            notEmpty.signalAll();
        }
        finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == 0){
                notEmpty.wait();
            }
            E e = queue.remove();
            notFull.signalAll();
            return e;

        }
        finally {
            lock.unlock();
        }
    }
}

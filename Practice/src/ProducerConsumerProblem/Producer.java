package ProducerConsumerProblem;

import java.util.*;

public class Producer implements Runnable {
    private final List<Integer> taskQueue;
    private final int max;

    public Producer(List<Integer> sharedQueue, int size){
        this.taskQueue = sharedQueue;
        this.max = size;
    }

    @Override
    public void run() {
        int counter = 0;
        while(true){
            try{
                produce(counter++);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    private void produce(int count) throws InterruptedException{
        synchronized (taskQueue){
            while(taskQueue.size() == max){
                System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting, size is " +
                        taskQueue.size());
                taskQueue.wait();
            }
            Thread.sleep(1000);
            taskQueue.add(count);
            System.out.println("Produced " + count);
            taskQueue.notifyAll();
        }
    }
}

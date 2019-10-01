package ProducerConsumerProblem;

        import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<Integer> taskqueue = new ArrayList<Integer>();
        int max = 5;
        Thread tProducer = new Thread(new Producer(taskqueue, max), "Producer");
        Thread tConsumer = new Thread(new Consumer(taskqueue), "Consumer");
        tProducer.start();
        tConsumer.start();
    }
}

package lab1.task5;

public class Collector implements Runnable {

    public void collect(int amountCollected) {
        try {
            synchronized (Main.lock) {
                while (DetailQueues.detailsToCollect.isEmpty()) {
                    Main.lock.wait();
                }
                Detail detail = DetailQueues.detailsToCollect.take();
                System.out.println("Собираем! Количество собранных деталей: " + (amountCollected + 1));
                DetailQueues.detailsToCheck.add(detail);
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            collect(i);
            try {
                Thread.sleep(300); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}




package lab1.task5;

public class QAOperator implements Runnable {

    public void check(int amountOfCheckedDetails) {
        try {
            synchronized (Main.lock) {
                while (DetailQueues.detailsToCheck.isEmpty()) {
                    Main.lock.wait();
                }
                DetailQueues.detailsToCheck.take();
                System.out.println("Проверяем деталь! Количество проверенных деталей: " + (amountOfCheckedDetails + 1));
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            check(i);
            try {
                Thread.sleep(150); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

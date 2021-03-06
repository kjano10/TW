public class MyThreadInc extends Thread {

    Counter myCounter;

    MyThreadInc(Counter c){
        this.myCounter=c;
    }

    public void run(){
        synchronized (myCounter) {
            for (int i = 0; i < 100000000; i++) {
                myCounter.increment();
            }
        }
    }
}

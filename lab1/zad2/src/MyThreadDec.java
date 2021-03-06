public class MyThreadDec extends Thread {
    Counter myCounter;

    MyThreadDec(Counter c){
        this.myCounter=c;
    }

    public void run(){
        synchronized (myCounter){
            for(int i=0; i<100000000; i++){
                myCounter.decrement();
            }
        }
    }
}
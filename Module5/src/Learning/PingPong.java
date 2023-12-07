package Learning;

public class PingPong extends Thread {
    private String word;    // what word to print
    private int   delay;   // how long to pause

    public PingPong(String whatToSay, int delayTime) {
        this.word = whatToSay;
        this.delay = delayTime;
    }

    public void run() {
        try {
            while (true) {
                System.out.print(this.word + " ");
                Thread.sleep(this.delay);    // wait until next time
            }
        } catch (InterruptedException e) {
            return;                     // end this thread
        }
    }

    public static void main(String[] args) {
        new PingPong("ping", 33).start();   // 1/30 second
        new PingPong("PONG", 200).start();  // 1/10 second
    }
}

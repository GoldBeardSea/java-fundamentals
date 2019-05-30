import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {

    int count = 5;
    System.out.println("I own " + count + " " + pluralize("dog", count) + ".");
    int n = 20;
    flipNHead(n);
    clock();
  }


    public static String pluralize(String own, int count) {
        if (count > 1 || count == 0) {
            return own+ "s";
        } else {
            return own;
        }
    }
  
    public static void flipNHead(int n) {
      int heads = 0;
      int flips = 0;
      do {
         double flip = Math.random();
          if (flip >= .5) {
            System.out.println("Heads");
            heads++;
            } else {
            System.out.println("Tails");
            heads = 0;
            }
            flips++;
        } while (heads != n);
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  public static void clock() {
    while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            String format = "%02d:%02d:%02d";
            String timeOut = String.format(format, hour, minute, second);
            System.out.println(timeOut);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
    }
  }
}
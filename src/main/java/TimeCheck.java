
public class TimeCheck {
    static long startTime;
    static long endTime;
    static long spentTime;

    static void start() {
        startTime = System.currentTimeMillis();
    }

    static void end() {
        endTime = System.currentTimeMillis();
        spentTime = endTime - startTime;
        System.out.println("소요시간: " + spentTime + "ms");
    }
}

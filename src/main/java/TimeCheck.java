
public class TimeCheck {
    static long startTime;
    static long endTime;

    static void start() {
        startTime = System.currentTimeMillis();
    }

    static long end() {
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

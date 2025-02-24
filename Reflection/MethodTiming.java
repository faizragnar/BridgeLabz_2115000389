import java.lang.reflect.Method;

class Sample {
    public void process() throws InterruptedException {
        Thread.sleep(500);
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Sample obj = new Sample();
        Method method = Sample.class.getMethod("process");

        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}

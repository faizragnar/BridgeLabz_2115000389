public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000; 

        
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }
        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }
        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        
        System.out.println("Time taken by StringBuffer: " + timeBuffer / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + timeBuilder / 1_000_000 + " ms");

        
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }
    }
}

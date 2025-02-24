import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveComputation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int num) {
        if (cache.containsKey(num)) {
            return cache.get(num);
        }
        int result = num * num;
        cache.put(num, result);
        return result;
    }
}

public class CachingSystem {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation obj = new ExpensiveComputation();
        Method method = ExpensiveComputation.class.getMethod("computeSquare", int.class);

        System.out.println("First Call (5): " + method.invoke(obj, 5));
        System.out.println("Second Call (5): " + method.invoke(obj, 5));
        System.out.println("First Call (10): " + method.invoke(obj, 10));
        System.out.println("Second Call (10): " + method.invoke(obj, 10));
    }
}

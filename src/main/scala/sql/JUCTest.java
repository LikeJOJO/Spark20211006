import scala.Tuple2;
import scala.runtime.BoxesRunTime;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JUCTest {
    public static void main(String[] args) {
        System.out.println(invokeCalc(3, 6, (int a, int b) -> {return a + b;}));
    }

    public static int invokeCalc(int a, int b, Calculator calculator) {
        return calculator.calc(a, b);
    }
}

@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}
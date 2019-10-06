import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RememberingFib rememberingFib = new RememberingFib();
        long startTime = 0;
        startTime = System.currentTimeMillis();
        System.out.println("Full-tree fibonacci:");
        startTime = System.currentTimeMillis();
        System.out.println(fib(45));
        System.out.println("Execution time: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("Saved sub-tree fibonacci:");
        startTime = System.currentTimeMillis();
        System.out.println(rememberingFib.findFib(45));
        System.out.println("Execution time: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int fib(int n){
        return (n>1) ? fib(n-1) + fib(n-2) : 1;
    }


}

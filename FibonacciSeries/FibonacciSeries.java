import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
    //TODO 1 : Find the Fibo Series and

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int n= 10;
        int a = 0, b = 1;
        System.out.println("Entered number: " + n);
        System.out.println(b);
        for(int i = 1;i <= n; i++){
            int next = a + b;
            a = b;
            b= next;
            map.put(i,next);
            System.out.println(next);
        }
        System.out.println(map);
        // TODO 2 : print the 10 th terms value.
        System.out.println("Printing the 10th items value : " + map.get(10));
//        for ( Map.Entry<Integer,Integer>  entry: map.entrySet()){
//            System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
//        }
    }
}

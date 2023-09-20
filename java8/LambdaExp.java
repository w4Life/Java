
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExp {

    final static List<String> arr1 = Arrays.asList("Hello", "Hi", "Kim", "Minh", "Hai");
    final static List<String> arr2 = Arrays.asList("New York", "Hanoi", "Longdon", "Paris", "Berlin");

    public static void main(String[] args) {
        
        // before java8
        Collections.sort(arr1, new Comparator<String>() {
            
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        
        System.out.println(arr1);

        // after java8
        Collections.sort(arr2, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        System.out.println(arr2);
    }
}
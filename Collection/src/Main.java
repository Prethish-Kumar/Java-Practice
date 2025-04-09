import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        System.out.println("My numbers list before:" + numbers);
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("My numbers list after:" + numbers);
        numbers.remove(2);
        System.out.println(numbers);
    }
}

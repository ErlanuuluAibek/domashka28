import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(100);
        }
        List<Integer> integers1 = new LinkedList<>(Arrays.stream(integers).toList());
        integers1.stream().filter(x -> x % 2 == 1).forEach(System.out::println);
        Optional<Double> doubleOptional = integers1.stream().filter(x -> x % 2 == 1).map(x -> Math.pow(x, 2)).max(Double::compare);
        System.out.println("Самое большое квадратное число:  " + doubleOptional);
    }
}
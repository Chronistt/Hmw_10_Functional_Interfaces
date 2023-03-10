import java.util.function.Predicate;
public class testMain {

    public static void main(String[] args) {
    Predicate<Integer> number = number1 -> (number1 >= 0); // задача 1 в лямбда выражении
        System.out.println(number.ifPositive1(3));
    };


public interface Predicate<Integer> {
    boolean ifPositive1(Integer number);
}
}

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static <T> void main(String[] args) {
        //Задача 1 в анонимном классе
        Predicate<Integer> number = new Predicate<Integer>() {
            @Override
            public boolean ifPositive(Integer number) {
                return number >= 0;
            }
        };
        System.out.println(number.ifPositive(-3));

        //Задача 1 в лямбда-интерфейсе
        Predicate<Integer> number5 = number12 -> number12 >= 0;
        System.out.println(number5.ifPositive(-3));

//задача 1 в отдельном классе
        IfPositivePredicate number1 = new IfPositivePredicate();
        System.out.println(number1.test(-6));

//задача 2 в анонимном классе
        Consumer <String> greeting = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + " , команда SkyPro приветствует тебя");
            }
        };
        greeting.accept("Виталий Наумович");

        //задача 2 в лямбда-интерфейсе
        Consumer <String> greeting2 = s -> System.out.println(s + " , команда SkyPro приветствует тебя");
        greeting2.accept("Виталий Наумович");

        //задача 3 в анонимном классе
        Function <Double, Long> rounded = new Function<Double, Long>() {
           @Override
            public Long apply(Double aDouble) {
               Long aLong = aDouble.longValue();
               return aLong;
            }
        };

        System.out.println(rounded.apply(125.687));
        //задача 3  в лямбда-интерфейсе
        Function <Double, Long> rounded2 = aDouble -> {
            Long aLong = aDouble.longValue();
            return aLong;
        };

        System.out.println(rounded2.apply(125.687));

        //4 задача в анонимном классе
        Supplier <Integer> number3 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                int randomNumber = random.nextInt(100);
                return randomNumber;
            }
        };
        System.out.println(number3.get());

        //4 задача в лямбда интерфейсе
        Supplier <Integer> number60 = () -> {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            return randomNumber;
        };
        System.out.println(number60.get());
    }

    public interface Predicate<Integer> { //реализация в отдельном классе
        boolean ifPositive(Integer number);
    }
}


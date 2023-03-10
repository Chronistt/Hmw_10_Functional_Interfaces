import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier implements Supplier <Integer>{
    @Override
    public Integer get() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
}

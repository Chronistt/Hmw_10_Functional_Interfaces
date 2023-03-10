import java.util.function.Predicate;
public class IfPositivePredicate implements Predicate <Integer> {

    @Override
    public boolean test(Integer number) {
        if (number >= 0) {
            return true;
        } else return false;
    }
}

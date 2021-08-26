package Utils;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalProgramming {

    private final Function<Integer,Integer> doubleValue=n-> n*2;

    public Function<Integer, Integer> getDoubleValue() {
        return this.doubleValue;
    }


}

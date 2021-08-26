package Data;

import java.util.Arrays;
import java.util.List;

public class StringData implements getData{


    @Override
    public List<String> getList() {
        return List.of("Hi","this", "is ","list");
    }

    @Override
    public String[] getArray() {
        return new String[]{"This", "is", "an", "array"};
    }
}

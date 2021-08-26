package Data;

import java.util.List;

public class IntegerData implements getData {

    @Override
    public  List<Integer> getList(){
        return List.of(1,2,3,4,5,6);
    }

    @Override
    public  Integer[] getArray() {
        return new Integer[]{1,2,3,4,5};
    }
}

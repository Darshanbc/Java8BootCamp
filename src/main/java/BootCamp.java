import Clients.FuncProgrammingClient;
import Data.IntegerData;
import Data.StringData;


public class BootCamp {
    public static void main(String[] args) {
        IntegerData integerData=new IntegerData();
        StringData stringData=new StringData();

        //Client to Double the value through Functional Programming
        new FuncProgrammingClient().simpleProgram1(integerData.getList());



    }
}

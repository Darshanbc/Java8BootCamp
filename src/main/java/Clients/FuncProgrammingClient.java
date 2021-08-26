package Clients;


import Utils.FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FuncProgrammingClient {

    FunctionalProgramming functionalProgramming=new FunctionalProgramming();
    public void simpleProgram1(List<Integer> intList){
        intList=intList.stream().map(functionalProgramming.getDoubleValue()).collect(Collectors.toList());
        System.out.println(intList);
    }
}

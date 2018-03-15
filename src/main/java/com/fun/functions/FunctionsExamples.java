package com.fun.functions;

import io.vavr.Function1;
import io.vavr.Function2;

public class FunctionsExamples {

    public static void main(String args[]){

        Function2<Integer,Integer,Integer> sum = (a,b) -> a + b ;
        System.out.println(sum.apply(1,2));


        Function1<Integer, Integer> plusOne = a-> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;

        Function1<Integer, Integer> add1AndMultiplyBy2 = plusOne.andThen(multiplyByTwo);

        System.out.println(add1AndMultiplyBy2.apply(2));

    }
}

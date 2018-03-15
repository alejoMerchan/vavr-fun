package com.fun.tuples;

import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TuplesExamples {

    public static void main(String args[]) {
        Tuple2<String,Integer> tuple2 = Tuple.of("java",8);
        System.out.println("valor 1: " + tuple2._1);
        System.out.println("valor 2: " + tuple2._2);

        Tuple2<String, Integer> that = tuple2.map(
                (s,i) -> Tuple.of(s.substring(2) + "vr" , i / 8)
        );
        System.out.println("valor 1: " + that._1);
        System.out.println("valor 2: " + that._2);

        String that2 = tuple2.apply((s,i) -> s.substring(2) + "vr " + i/ 8);

        System.out.println("valor: " + that2);
    }
}

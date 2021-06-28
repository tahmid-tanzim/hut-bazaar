package com.oneleven.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Lambda {

    public void test() {
        ArrayList<String> students = new ArrayList<>();
        students.add("Tanzim");
        students.add("Fatiha");
        students.add("Serhan");

        // Consumer
        Consumer<String> printItem = s -> System.out.println(s);
        students.forEach(printItem);

        // Function
        Function<Integer, Double> calc = n -> n * n + 0.75;
        System.out.println(calc.apply(4));

        // Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree);

        // Supplier
        Supplier<Double> randomNum = () -> Math.random() * 100;
        System.out.println(randomNum.get());
    }
}

package it.bemyeye.learn.functional;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReducingStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);

        Integer sum = numbers.stream().reduce(0, (accumulator, each)-> accumulator += each);
        System.err.println(sum);

        Integer sameSum = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer result, Integer element) {
                return result + element;
            }
        });
        System.err.println(sameSum);
    }

}

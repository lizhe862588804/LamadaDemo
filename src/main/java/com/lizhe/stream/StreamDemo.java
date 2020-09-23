package com.lizhe.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Auther: lizhe
 * @Date: 2020/9/9 - 09 - 09 - 9:21
 * @Description:com.lizhe.stream
 * @version: 1.0
 */
public class StreamDemo {

    public static void main(String[] args) {
      /*  IntStream chars = "asdfghjkl".chars();
        Stream<Integer> integerStream = chars.mapToObj((x) -> x);
        integerStream.forEach(System.out::println);


        List<Integer> integers = Arrays.asList(1, 2, 4, 3, 5, 1, 8, 0, 9);
        Stream<Integer> integerList = integers.stream();

        integerList.forEach(System.out::print);

        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(System.out::println);

        Stream<String> generate1 = Stream.generate(() -> "sd");
        generate1.limit(3).forEach(System.out::println);

        Stream<Boolean> generate2 = Stream.generate(() ->1>3);
        generate2.limit(3).forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(6).forEach(System.out::println);*/

        List<Integer> integers = Arrays.asList(1, 2, 4, 3, 5, 1, 8, 0, 9);
        List<Integer> integerz = Arrays.asList(12, 11,22,33,444);
        Stream<Integer> integerStream = integers.stream();
        Stream<Integer> integerStream2 = integerz.stream();
//        integerStream.filter((x)->x%2==0).collect(Collectors.toList()).forEach(System.out::print);
//        integerStream.distinct().collect(Collectors.toList()).forEach(System.out::print);
//        integerStream.distinct().map((x) -> new People(x)).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(integerStream.max((a, b) -> a - b).get());
//        System.out.println(integerStream.findAny().get());
//        System.out.println(integerStream.findFirst().get());
//        integerStream.sorted((a,b)->b-a).forEach(System.out::println);

//        integerStream.skip(2).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(integerStream.mapToInt((x) -> x).sum());
//        System.out.println(integerStream.anyMatch(x -> x == 3));
        System.out.println(integerStream.anyMatch(x -> integerz.stream().anyMatch(y -> y == x)));

    }

}

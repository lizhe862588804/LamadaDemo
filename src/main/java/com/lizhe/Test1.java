package com.lizhe;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Auther: lizhe
 * @Date: 2020/9/6 - 09 - 06 - 13:44
 * @Description:com.lizhe
 * @version: 1.0
 */
public class Test1 {

    public static void main(String[] args) throws Exception {


        Callable callable = new Callable() {

            @Override
            public Object call() throws Exception {
                return null;
            }
        };
        callable.call();
        Callable c1 = () -> {
            String s = "lizhe";
            return s;
        };
        System.out.println(c1.call());

        Callable<String> c2 = () -> "lizhe";
        System.out.println(c2.call());

        Callable<String> c4 = () -> {
            System.out.println("dddddddd");
            return "lizhe";
        };

        Function<String,Integer> f = (a)->a.length();


        System.out.println(f.apply(""));
        Callable<Integer> c3 = ()->gohome();

        Callable<Integer> c9 = Test1::gohome;
        System.out.println(c3.call());


        Runnable r = ()-> gohome2();
        r.run();

        Callable<Integer> c7 = Test1::gohome;
        System.out.println("c7==================="+c7.call());


        Mouse<Rice,Integer,Integer> m1 =(a,b,c)->a.beEatean(b,c);
        Mouse<Rice,Integer,Integer> m4 =(a,b,c)->{a.beEatean(b,c);};
        m1.steal(new Rice(),1,2);
        Mouse<Rice,Integer,Integer> m2 = Rice::beEatean;
        m2.steal(new Rice(),2,3);
        Mouse<Rice,Integer,Integer> m3 = Test1::gohome3;
        Mouse<Rice,Integer,Integer> m7 = (a,b,c)->gohome3(a,b,c);
        m3.steal(new Rice(),1,2);

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.forEach(System.out::println);
        list.forEach(Test1::add);

        Consumer<Object> c = (o)-> {
            System.out.println();
        };
        System.out.println(111111111);
    }

    public static Integer gohome(){
        return 1;
    }
    public static void gohome2(){

    }

    public static void gohome3(Rice r,Integer m,Integer n){

    }
    public static int  add(int o){
        System.out.println(o-1);
        return 1;
    }


}

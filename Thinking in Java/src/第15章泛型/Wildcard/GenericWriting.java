package 第15章泛型.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

    static <T> void writeExact(List<T> list,T item){
        list.add(item);
    }

    static List<Apple> apples=new ArrayList<>();
    static List<Fruit> fruits=new ArrayList<>();

    static void f1(){
        writeExact(apples,new Apple());
        //书上说这里会报错，然而并没有
        writeExact(fruits,new Apple());
        writeExact(fruits,new Orange());
    }

    static <T> void writeWithWildcard(List<? super T> list,T item){
        list.add(item);
    }

    static void f2(){
        writeWithWildcard(apples,new Apple());
        writeWithWildcard(fruits,new Apple());
    }

    public static void main(String[] args){
        f1();
        f2();
    }
}

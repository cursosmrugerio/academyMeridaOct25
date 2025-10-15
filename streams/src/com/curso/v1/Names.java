package com.curso.v1;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Names {
    //HAS-A
    private List<String> list;

    public List<String> getList() { //getter
        return list;
    }

    public void setList(List<String> list) { //setter
        this.list = list;
    }

    public void printNames() {
        System.out.println(getList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Bob Hope",
                "Bob Dole",
                "Bob Brown");
        Names n = new Names();

        Stream<String> myStream = list.stream();
        Collector<String,?,List<String>> myCollector = Collectors.toList();
        List<String> myList = myStream.collect(myCollector);
        n.setList(myList);

        n.setList(list.stream().collect(Collectors.toList()));
        //n.setList(list.stream().toList()); //A partir Java 16
        List<String> myList2 = n.getList();

        //t -> void
        //Consumer myConsumer = Names::printNames; //ERROR COMPILATION
        myList2.forEach(System.out::println);

        //n.getList().forEach(Names::printNames); //ERROR COMPILATION
    }
}
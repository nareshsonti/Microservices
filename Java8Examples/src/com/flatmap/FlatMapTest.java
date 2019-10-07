package com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapTest {
	public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
          
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
         
        List<Integer> listOfAllIntegers = listOfLists.stream()
                                    .flatMap(x -> x.stream())
                                    .collect(Collectors.toList());
        
        
        IntStream intStream = listOfLists.stream().flatMapToInt(x->x.stream().mapToInt(Integer::new));
        int sum = intStream.peek(System.out::println).sum();
        System.out.println("Intstream sum "+sum);
        

  
        System.out.println(listOfAllIntegers);
    }
}

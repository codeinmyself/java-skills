package com.study.java.skills.streamapi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class 过滤器Filter {


    /**
     * 过滤链表，返回值大于某数的元素总和
     * op：filter后count
     */
    @Test
    public void case1() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(16);
        numbers.add(15);
        numbers.add(32);
        numbers.add(56);

        //Java 7做法
        long count = 0;
        for(Integer i:numbers){
            if(i>20){
                count++;
            }
        }
        System.out.println("count："+count);

        //Java 8做法
        long count1 = numbers.stream().filter(i -> i > 20).count();
        System.out.println("count："+count1);
    }
}

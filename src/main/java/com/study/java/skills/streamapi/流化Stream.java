package com.study.java.skills.streamapi;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class 流化Stream {

    /**
     * 针对数组
     * op1:Arrays.stream()流化
     */
    @Test
    public void case1() {
        //op1:
        Integer[] array = new Integer[]{3,4,8,16,19,27,23,99,76,232,33,96};
        long count = Arrays.stream(array).filter(i->i>20).count();
    }

    /**
     * 针对数组
     * op2:Stream.of()流化,还支持多参数'Stream.of(12,77,59,3,654)'
     * 实质：底层还是调用的Arrays.stream()
     */
    @Test
    public void case2() {
        //op2:
        Integer[] array = new Integer[]{3,4,8,16,19,27,23,99,76,232,33,96};
        long count = Stream.of(array).filter(i->i>20).count();
        long sum = Stream.of(12,77,59,3,654).filter(i->i>20).mapToInt(Integer::intValue).sum();
        System.out.println("count："+count+",sum:"+sum);
    }
}

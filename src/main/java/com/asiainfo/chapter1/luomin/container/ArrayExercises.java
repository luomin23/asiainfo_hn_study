package com.asiainfo.chapter1.luomin.container;

import java.util.Arrays;

/**
 * @author Luoo
 * @create 2017-08-02 10:42
 */

public class ArrayExercises implements Comparable {
    private String name;
    private int age;

    public ArrayExercises(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof ArrayExercises) {
            ArrayExercises ae = (ArrayExercises) o;
            return age - ae.age;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "ArrayExercises{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ArrayExercises[] aeArry = new ArrayExercises[3];
        ArrayExercises ae1 = new ArrayExercises("hello1", 18);
        ArrayExercises ae2 = new ArrayExercises("hello2", 35);
        ArrayExercises ae3 = new ArrayExercises("hello2", 15);

        aeArry[0] = ae1;
        aeArry[1] = ae2;
        aeArry[2] = ae3;

        System.out.println(Arrays.toString(aeArry));

        Arrays.sort(aeArry);

        System.out.println(Arrays.toString(aeArry));

    }
}

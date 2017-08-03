package com.asiainfo.chapter1.luhui.luhui8;

/**
 * Created by 18237161432 on 2017/8/2.
 */
public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.print(element);
        }
        System.out.println();
    }
public static void main(String[] args){
    Integer[] integer={3,4,2,6,77,23,23,56};
    Double[] doubles={1.2,3.5,32.4,6.6,6.6,5.7};
    Character[] character={'L','l','陆','辉','帅'};
    System.out.println("整型数组输出：");
    printArray(integer);
    System.out.println("双精度数组输出：");
    printArray(doubles);
    System.out.println("字符型数组输出：");
    printArray(character);
}

}

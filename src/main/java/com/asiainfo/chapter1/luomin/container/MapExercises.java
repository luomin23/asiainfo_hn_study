package com.asiainfo.chapter1.luomin.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Luoo
 * @create 2017-07-31 10:47
 */

public class MapExercises {

    public static void entrySetExercise() {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.put("param" + i, i);
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        MapExercises.entrySetExercise();
    }
}

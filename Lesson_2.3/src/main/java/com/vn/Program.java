package com.vn;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 */
public class Program {

    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        int m = 201;
        for (String str : strs) {
            m = Math.min(m, str.length());
        }
        int n = strs.length;
        int i = 0;
        while (i < m) {
            for (int j = 0; j < n - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return answer;
                }
            }
            answer += strs[0].charAt(i);
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
//        new Bai1();
//        new Bai2();
//        new Bai3();
//        new Bai4();
    }
}

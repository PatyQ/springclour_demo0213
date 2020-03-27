package com.cy.springcloudstreamoutput;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SwepDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        String next = scanner.next();
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        Set<String> keySet = map.keySet();
        char[] chars = next.toCharArray();
        int i = 0;
        while (i < chars.length-4){
            String sc3 = String.valueOf(chars, i, 5);
            for (String str : keySet) {
                if (sc3.contains(str)) {
                    String s = map.get(str);
                    stringBuffer.append(s);
                    i=i+2;
                }
            }
            i++;
        }
        String toString = stringBuffer.toString();
        if (StringUtils.isEmpty(toString)){
            System.out.println("为空");
            return;
        }
        System.out.println(toString);
    }
}

package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
            if((list.get(i).length()) < minLength){
                minLength = list.get(i).length();
            }
        }

        for(String s : list){
            if(s.length() == minLength)
                System.out.println(s);
        }
    }
}

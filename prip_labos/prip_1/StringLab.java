package hr.fer.oop.vjezbe4;

import java.util.*;
class StringLab {
    public static String stringFloss(String[] elements) {
        StringBuilder sb = new StringBuilder();
        if (getLongest(elements) == 0) return "";
        for (int i = 0; i < getLongest(elements); i++) {
            for (int j = 0; j < elements.length; j++) {
                if (i < elements[j].length()) sb.append(elements[j].charAt(i));
            }


        }
        return sb.toString();
    }
    public static int getLongest(String[] Names) {
        if (Names.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < Names.length; j++) {
            if (Names[j].length() > Names[i].length()) {
                i = j;
            }
        }
        return Names[i].length();
    }


    //Zadatak split
    public static int brojSamoglasnika(String str){
        int i = 0;
        for (char c: str.toCharArray()){
            for (int a = 65; a <=85; a += a < 73 ? 4 : 6){
                if (c == a || c == a + 32) {
                    i++;
                    break;
                }
            }
        }
        return i;

    }


    //Zadatak split
    static boolean common_digit(int twoDigitNum1, int twoDigitNum2){
        if (twoDigitNum1 < 10 || twoDigitNum1 > 99 || twoDigitNum2 < 10 || twoDigitNum2 > 99) return false;
        if (twoDigitNum1 % 10 == twoDigitNum2 % 10 ||
                twoDigitNum1 % 10 == twoDigitNum2 / 10 ||
                twoDigitNum1 / 10 == twoDigitNum2 % 10 ||
                twoDigitNum1 / 10 == twoDigitNum2 / 10)
            return true;
        return false;
    }

    
    //Zadatak split
    static void swap(int[] arr){
        ArrayList<Integer> indexi = new ArrayList<Integer>();
        while (indexi.size() < 3){
            int gen = (int) (Math.random() * arr.length);
            if (!indexi.contains(gen)) indexi.add(gen);
        }
        java.util.Collections.sort(indexi);

        int temp = arr[indexi.get(0)];
        for (int i = 0; i < 3; i++){
            arr[indexi.get(i)] = i < 2 ? arr[indexi.get(i + 1)] : temp;
        }
    }
}











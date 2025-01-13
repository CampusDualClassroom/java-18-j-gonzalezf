package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

    public static void main(String[] args) {

        int num = Utils.integer("Introduce el número de elementos del array: ");

        int[] intArray = createAndInitializeArray(num);
        showInlineArray(intArray);

    }

    public static int[] createAndInitializeArray(int n) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        return array;

    }

    public static void showInlineArray(int[] a) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);

    }

}

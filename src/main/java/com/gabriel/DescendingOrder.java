package com.gabriel;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder{
    public static int sortDesc(final int num){

        String digits [] = String.valueOf(num).split("");

        Arrays.sort(digits, Collections.reverseOrder());

        String numeros_ordenados = String.join("", digits);

        Integer numeros_ordenados_2 = Integer.parseInt(numeros_ordenados);

        return numeros_ordenados_2;
    }

    public static void main(String[] args) {
    System.out.println(DescendingOrder.sortDesc(12356));
    System.out.println(DescendingOrder.sortDesc(23423));
    System.out.println(DescendingOrder.sortDesc(568568));
    System.out.println(DescendingOrder.sortDesc(89077));
}
}



package ru.KazurovaMarina.HomeWork_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.task1();
        Main.task3();
    }
    // 1. Написать программу перевода чисел из 10 системы счисления в 2 систему счисления.
    // 2. Написать программу перевода чисел из 10 системы счисления в 16 систему счисления.

    public static void task1() {
        int variable_2_16 = 2;


        int lengthArr = 0;
        int y;// временная переменная
        int remainderofdivision = 0;// остатки от деления
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = in.nextInt();
        System.out.println("Вы ввели число: " + x);
        y = x;
        while (y != 0) {     // Колличество элементов в массиве (длина массива)
            y /= variable_2_16;
            lengthArr++;
            //System.out.println(lengthArr);
        }



        if (variable_2_16 == 16) {
            char[] arr = new char[lengthArr]; // Массив с колличеством элементов lengthArr
            for (int i = 0; i < arr.length; i++) { // Инициализируем элементы массива остатками от деления

                remainderofdivision = x % variable_2_16;



                char remainderofdivisionChar = (char) remainderofdivision;
                    if (remainderofdivision == 10) {
                        remainderofdivisionChar = 'a';
                    } else if (remainderofdivision == 11) {
                        remainderofdivisionChar = 'b';
                    } else if (remainderofdivision == 12) {
                        remainderofdivisionChar = 'b';
                    } else if (remainderofdivision == 13) {
                        remainderofdivisionChar = 'c';
                    } else if (remainderofdivision == 14) {
                        remainderofdivisionChar = 'd';
                    } else if (remainderofdivision == 15) {
                        remainderofdivisionChar = 'e';
                    }  else {
                        remainderofdivisionChar = '3';
                        System.out.println("fhgfh "  );
                    }
                System.out.println(remainderofdivisionChar);
                    arr[i] = remainderofdivisionChar;
                    x /= variable_2_16;
                }
                lengthArr = arr.length; // количество элементов = длине массива
                System.out.print("В 16 системе исчисления: ");
                while (lengthArr != 0) { //последовательный вывод элементов массива от последнего до первого
                    lengthArr--;
                    System.out.print(arr[lengthArr]);

                }
            }
         else if(variable_2_16 == 2){
            int[] arr = new int[lengthArr]; // Массив с колличеством элементов lengthArr
            for (int i = 0; i < arr.length; i++) { // Инициализируем элементы массива остатками от деления
                remainderofdivision = x % variable_2_16;
                arr[i] = remainderofdivision;
                x /= variable_2_16;
                lengthArr = arr.length; // количество элементов = длине массива
            }
                System.out.print("В двоичной системе исчисления: ");
                while (lengthArr != 0) { //последовательный вывод элементов массива от последнего до первого
                    lengthArr--;
                    System.out.print(arr[lengthArr]);
                }

        }


    }


// 3.  Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
    // Нeобходимо найти в данном массиве такие два числа n и m, чтоюы иx сумма была равно 7.
    //Например: 2+5 = 7, 6+1 = 7, -2+9 = 7


    private static void task3() {
        int dif;
        int cellN;
        int[] Arr = {6, 40, 7, 1, -5, 234, 3, 4, 7, -2, -345, -2,-6,-4}; //Массив для примера
        int[] tempArr = new int[Arr.length];
        int index1 = -1;
        boolean indCheck = false;
        Arrays.sort(Arr);
        System.out.println("n + m = 7");
        for (int i = 0; i < Arr.length; i++) {
            indCheck = false;
            for (int j = 0; j < index1; j++) {
                if (i == tempArr[j]){
                    indCheck = true;
                    break;
                }
            }
            if (!indCheck) {
                dif = 7 - Arr[i];
                cellN = Arrays.binarySearch(Arr, dif);
                if (cellN >= 0) {
                    System.out.println(Arr[i] + " и " + Arr[cellN]);
                    index1 = index1 + 1;
                    tempArr[index1] = cellN;
                }
            }
        }
    }



}



package com.metanit;

import java.util.Scanner;

/*
*Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные целому числу X.
*В результате должен получиться массив не большей размерности.
*На экран должны выводиться как оригинальное состояние массива, так и итоговое.
*/

public class labN4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //Объявление
        int A[], N = 0;

        System.out.println("Введите размерность массива:");
        while (!in.hasNextInt()) {
            System.out.println("Ошибка: размерность массива должна быть целочисленной!");
            System.out.println("Введите размерность массива:");
            in.next();
        }
        N = in.nextInt();

        //Определение
        A = new int[N];
        int calculation = 0;

        //Инициализация
        for (int i = 0; i < A.length; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            while (!in.hasNextInt()) {
                System.out.println("Ошибка: элементы массива должны быть целочисленными!");
                System.out.print("Введите " + i + "-й элемент массива: ");
                in.next();
            }
            A[i] = in.nextInt();
        }

        System.out.println("Введите целое число, чтобы удалить равные ему элементы из массива:");
        while (!in.hasNextInt()) {
            System.out.println("Ошибка: введённым может быть только целое число!");
            System.out.println("Введите целое число, чтобы удалить равные ему элементы из массива:");
            in.next();
        }
        int X = in.nextInt();

        //Оригинальное состояние массива
        System.out.println("Оригинальное состояние массива:");
        for (int elem : A) {
            System.out.print(elem + " ");
            if (elem == X) {
                calculation++;
            }
        }
        System.out.println();

        //Преобразования
        int[] copy = new int[A.length - calculation];
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != X) {
                copy[index] = A[i];
                index++;
            }
        }

        //Итоговое состояние массива
        System.out.println("Итоговое состояние массива:");
        for (int elem : copy)
            System.out.print(elem + " ");
        System.out.println();

        in.close();
    }
}

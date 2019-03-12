package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestSortMethods {
    String print(Integer[] mass) {
        int size = mass.length;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++)
            sb.append(mass[i]+" ");

        return  sb.toString();
    }

    void test() {
        ArrayList<Sorter> sorters = new ArrayList<Sorter>();
        sorters.add(new BuddleSorter());
        sorters.add(new InsertSorter());
        sorters.add(new SelectSorter());
        sorters.add(new ShellSorter());

        System.out.println("Введите размер массива для тестирования методов сортировки:");
        Scanner scr = new Scanner(System.in);
        int testMassSize = scr.nextInt();

        Random rand = new Random();
        Integer[] mass = new Integer[testMassSize];
        for(int i=0; i<testMassSize; i++)
            mass[i] = rand.nextInt(1000);
       
        System.out.println("Тестовый массив:\n" + print(mass) +"\n");

        for(Sorter s: sorters) {
            Integer[] massCopy = (Integer[]) mass.clone();
            System.out.println(s+":");
            Double time = s.sortTime(massCopy);
            System.out.println(print(massCopy));
            System.out.println("Затраченное время: "+ time+ " секунд.\n");
        }
    }
}

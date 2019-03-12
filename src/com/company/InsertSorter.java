package com.company;

public class InsertSorter implements Sorter {
    public void sort(Integer[] mass){
        int x;
        int i, j;
        int backup = mass[0];
        int size = mass.length;
        mass[0] = Integer.MIN_VALUE;

        for ( i=1; i < size; i++) {
            x = mass[i];

            for ( j=i-1; mass[j] > x; j--)
                mass[j+1] = mass[j];

            mass[j+1] = x;
        }

        for ( j=1; j<size && mass[j] < backup; j++)
            mass[j-1] = mass[j];

        mass[j-1] = backup;
    }

    public String toString(){
        return("Сортировка методом вставки");
    }
}

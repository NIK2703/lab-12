package com.company;

public class SelectSorter implements Sorter {
    public void sort(Integer[] mass){
        int i, j, k;
        int size = mass.length;
        int x;

        for( i=0; i < size; i++) {
            k=i;
            x=mass[i];

            for( j=i+1; j < size; j++)
                if (  mass[j] < x ) {
                    k=j; x=mass[j];
                }

            mass[k] = mass[i];
            mass[i] = x;
        }
    }
    public String toString(){
        return("Сортировка выбором");
    }
}

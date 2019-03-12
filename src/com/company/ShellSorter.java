package com.company;

public class ShellSorter implements Sorter {

    int increment(int inc[], int size) {
        int p1, p2, p3, s;

        p1 = p2 = p3 = 1;
        s = -1;
        do {
            if (++s % 2 == 1) {
                inc[s] = 8*p1 - 6*p2 + 1;
            } else {
                inc[s] = 9*p1 - 9*p3 + 1;
                p2 *= 2;
                p3 *= 2;
            }
            p1 *= 2;
        } while(3*inc[s] < size);

        return s > 0 ? --s : 0;
    }

    public void sort(Integer[] mass) {
        int inc, i, j, seq[];
        seq = new int[40];
        int s;
        int size = mass.length;

        s = increment(seq, size);
        while (s >= 0) {
            inc = seq[s--];

            for (i = inc; i < size; i++) {
                int temp = mass[i];
                for (j = i-inc; (j >= 0) && ( mass[j] > temp); j -= inc)
                    mass[j+inc] =  mass[j];
                mass[j+inc] = temp;
            }
        }
    }
    public String toString(){
        return("Сортировка методом Шелла");
    }


}

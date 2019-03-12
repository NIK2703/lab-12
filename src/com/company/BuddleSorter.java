package com.company;

public class BuddleSorter implements Sorter {
    public void sort(Integer[] mass){
        int j, k = mass.length-1;
        int lb=1, ub = mass.length-1;
        int x;

        do {
            for( j=ub; j>0; j-- ) {
                if ( mass[j-1] > mass[j] ) {
                    x=mass[j-1]; mass[j-1]=mass[j]; mass[j]=x;
                    k=j;
                }
            }

            lb = k+1;
            for (j=1; j<=ub; j++) {
                if ( mass[j-1] > mass[j] ) {
                    x=mass[j-1]; mass[j-1]=mass[j]; mass[j]=x;
                    k=j;
                }
            }

            ub = k-1;
        }
        while ( lb < ub );
    }

    public String toString(){
        return("Сортировка методом пузырька");
    }
}

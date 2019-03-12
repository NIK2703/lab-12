package com.company;

import java.util.Date;

public interface Sorter {
    void sort(Integer[] mass);
    default double sortTime(Integer[] mass){
        Date startDate = new Date();
        sort(mass);
        Date endDate = new Date();
        return (double)(endDate.getTime() - startDate.getTime())/1000;
    }
}

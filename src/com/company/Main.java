package com.company;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < GlobalRating.data.length; i++) {
            System.out.print(GlobalRating.data[i].category + ": ");
            for (int j = 0; j < GlobalRating.data[i].statistic.length; j++) {
                System.out.print(GlobalRating.data[i].statistic[j]);
                if (j < GlobalRating.data[i].statistic.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

package com.company;

public class Score {

    String category;
    double[] statistic;

    {
        statistic = new double[10];
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = (Math.round(Math.random() * 25.00) + 25.00);
        }
    }
}


package com.company;

public class GlobalRating {

    static String[] categories = {"views", "actions", "sharings", "buyings"};
    static Score[] data;

    static {
        data = new Score[categories.length];
        for (int i = 0; i < data.length; i++) {
            Score score = new Score();
            score.category = categories[i];
            data[i] = score;
        }
    }
}



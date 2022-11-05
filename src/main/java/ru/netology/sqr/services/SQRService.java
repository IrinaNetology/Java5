package ru.netology.sqr.services;


public class SQRService {


    public int countSquares(int minimum, int maximum) {


        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;

            if (sqr >= minimum && sqr <= maximum) {
                count++;
            }

        }
        return count;
    }
}

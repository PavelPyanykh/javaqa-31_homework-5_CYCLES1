package ru.netology.sqr;

public class SqrService {

    public int sqrCount(int bottom, int top) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottom) {
                if (i * i <= top)
                    count++;
            }
        }
        return count;
    }
}

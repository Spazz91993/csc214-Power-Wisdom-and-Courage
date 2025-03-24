package org.example;

public class TriangleNumberCalc {
    public int value(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + value(n - 1);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}


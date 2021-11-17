package com.example.lab1mobile;

public class Myclass {
    public int Maximum(int a, int b) {
        int max = 0;
        if(a > b) max = a;
        else max = b;
        return max;
    }

    public int Minimum(int a, int b) {
        int min = 0;
        if(a < b) min = a;
        else min = b;
        return min;
    }
}
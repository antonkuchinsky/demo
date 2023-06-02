package com.example.demo.models;


import java.util.Random;

public class Dice {

    public static int roll() {

        return new Random().nextInt((11)+2);
    }
}

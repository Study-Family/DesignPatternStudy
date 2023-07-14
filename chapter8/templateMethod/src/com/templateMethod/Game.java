package com.templateMethod;

public class Game {
    public static void main(String[] args) {
        GameAI orcAI = new OrcsAI();
        orcAI.turn();
    }
}

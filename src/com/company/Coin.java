package com.company;

import java.util.Random;

public class Coin {
    private String side = "";

    public Coin() {

        double rand = Math.random();
        if (rand < 0.3) {
            this.side = "Head";
        } else if (rand > 0.3 && rand <0.6 ) {
            this.side = "Tail";

        }
        else
            this.side = "####";
    }

    public String getSide() {
        return this.side;
    }

    public void setSide( String side) {
        this.side = side;
    }
}

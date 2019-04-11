package com.example.animalapp;


import java.util.ArrayList;
import java.util.Random;


public class Fox extends Animal {

    public String say(){
        ArrayList<String> foxSays = new ArrayList<String>();
        foxSays.add("Jof-tchoff-tchoffo-tchoffo-tchoff!");
        foxSays.add("Ring-ding-ding-ding-dingeringeding!");
        foxSays.add("Wa-pa-pa-pa-pa-pa-pow!");
        foxSays.add("Hatee-hatee-hatee-ho!");
        foxSays.add("Chacha-chacha-chacha-chow!");
        foxSays.add("Fraka-kaka-kaka-kaka-kow!");
        foxSays.add("A-hee-ahee ha-hee!");
        foxSays.add("A-oo-oo-oo-ooo! Woo-oo-oo-ooo!");
        foxSays.add("Wa-wa-way-do, wub-wid-bid-dum-way-do, wa-wa-way-do. Bay-budabud-dum-bam. Mama-dum-day-do. Abay-ba-da bum-bum bay-do");

        Random rand = new Random();
        String result = foxSays.get(rand.nextInt(foxSays.size()));

        return result;
    }
    public String play(){
        return "The fox chases mice and digs holes!";
    }
    public Fox() {
    }
}

package com.example.animalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView)findViewById(R.id.output);

        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();
        Fox fox = new Fox();




        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);

        /*this.output.append("\nDuck say " + duck.say());
        this.output.append("\nFish goes " + animals.get(1).say());
        this.output.append("\nSeal goes " + seal.say());*/

        /*for(int i = 0; i < animals.size(); i++){
            this.output.append("\n" + animals.get(i).getClass().getSimpleName() + " say " + animals.get(i).say());

        }*/

        for(Animal animal:animals){

            if (animal instanceof Seal) {
                this.output.append("\n" + ((Seal)animal).play());
            }

            if (animal instanceof Fox) {
                this.output.append("\n" + ((Fox)animal).play());
            }

            this.output.append("\n" + animal.getClass().getSimpleName() + " say " + animal.say());
        }

    }


}

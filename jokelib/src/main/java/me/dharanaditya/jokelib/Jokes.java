package me.dharanaditya.jokelib;

import java.util.Random;

public class Jokes {
    // A class to generate random integers
    private Random mRandom = new Random();
    // Array to store jokes
    private String[] jokes = generateJokes();
    // Variable to for size of jokes array
    private int size;

    public Jokes(){
        size = jokes.length;
    }

    public String getJoke(){
        // generate a random number less than the value of size
        // returns joke at index of generated random number
        return jokes[mRandom.nextInt(size)];
    }

    private String[] generateJokes() {

        return new String[]{
                "Q: Is Google male or female?\n" +
                        "A: Female, because it doesn't let you finish a sentence before making a suggestion.",
                "Girlfriend: \"Am I pretty or ugly?\"\n" +
                        "Boyfriend: \"You're both.\"\n" +
                        "Girlfriend: \"What do you mean?\"\n" +
                        "Boyfriend: \"You're pretty ugly.\"",
                "Wife: \"Our new neighbor always kisses his wife when he leaves for work. Why don't you do that?\"\n" +
                        "Husband: \"How can I? I don't even know her.\"",
                "Marriage is a three-ring circus: engagement ring, wedding ring, and suffering.\n",
                "Q. How does a computer get drunk?\n" +
                        "A. It takes screenshots.\n",
                "Why are iPhone chargers not called Apple Juice?!",
                "Q: Did you hear about the tree's birthday?\n" +
                        "A: It was a sappy one!\n",
                "Dear eyelashes, wishbones, dandelions, pennies, shooting stars, 11:11 and birthday candles: Do your job.\n",
                "Did you hear about the love affair between sugar and cream?  It was icing on the cake.\n",
                "Q. What should you do after your Nintendo game ends in a tie?\n" +
                        "A. Ask for a Wii-match!\n",
                "I was going to make myself a belt made out of watches, but then I realized it would be a waist of time.\n"
        };
    }
}

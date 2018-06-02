package com.korcholis.jokeslib;

import java.util.Random;

public class Jokes {
    private static final String[] jokes = new String[] {
        "Why is Android so healthy? Cause it eats an Apple a day.",
        "I like Apples, but I prefer Oreos",
        "*Knock knock* \"Who's there?\" \"Apple\" *Locks the door*"
    };

    public String tell() {
        return this.jokes[(new Random()).nextInt(jokes.length)];
    }
}

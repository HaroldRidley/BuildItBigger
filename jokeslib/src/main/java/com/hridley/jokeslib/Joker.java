package com.hridley.jokeslib;

import java.util.Random;

/**
 * A class tha provides random joke Strings via its static method "getRandomJoke"
 */
public final class Joker {

    private static String[] jokesList = {
            "Did you hear about the restaurant on the moon? Great food, no atmosphere.",
            "What do you call a fake noodle? An Impasta.",
            "How many apples grow on a tree? All of them.",
            "Want to hear a joke about paper? Nevermind it's tearable.",
            "I just watched a program about beavers. It was the best dam program I've ever seen.",
            "Why did the coffee file a police report? It got mugged.",
            "How does a penguin build it's house? Igloos it together.",
            "Dad, did you get a haircut? No I got them all cut.",
            "What do you call a Mexican who has lost his car? Carlos.",
            "Dad, can you put my shoes on? No, I don't think they'll fit me.",
            "Why did the scarecrow win an award? Because he was outstanding in his field.",
            "Why don't skeletons ever go trick or treating? Because they have no body to go with.",
            "Ill call you later. Don't call me later, call me Dad.",
            "What do you call an elephant that doesn't matter? An irrelephant",
            "Want to hear a joke about construction? I'm still working on it.",
            "What do you call cheese that isn't yours? Nacho Cheese.",
            "Why couldn't the bicycle stand up by itself? It was two tired.",
            "What did the grape do when he got stepped on? He let out a little wine.",
            "I wouldn't buy anything with velcro. It's a total rip-off.",
            "The shovel was a ground-breaking invention.",
            "Dad, can you put the cat out? I didn't know it was on fire.",
            "This graveyard looks overcrowded. People must be dying to get in there.",
            "Whenever the cashier at the grocery store asks my dad if he would like the milk in a bag he replies, \"No, just leave it in the carton!\"",
            "5/4 of people admit that they’re bad with fractions.",
    };

    /**
     * This class should not be instantiated
     */
    private Joker(){}

    /**
     * This method fetches randomly one of the available jokes
     * @return String containing a random joke
     */
    public static String getRandomJoke(){
        Random random = new Random();
        return jokesList[random.nextInt(jokesList.length -1)];
    }
}

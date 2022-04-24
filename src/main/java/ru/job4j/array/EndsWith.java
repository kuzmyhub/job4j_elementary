package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int arrayLength = Math.min(word.length, post.length);
        for (int i = 0; i < arrayLength; i++) {
            String wordString = Character.toString(word[word.length - i - 1]);
            String postString = Character.toString(post[post.length - i - 1]);
            if (!wordString.endsWith(postString)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
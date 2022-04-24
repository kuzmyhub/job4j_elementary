package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int arrayLength = Math.min(word.length, pref.length);
        for (int i = 0; i < arrayLength; i++) {
            String wordString = Character.toString(word[i]);
            String prefString = Character.toString(pref[i]);
            if (!wordString.startsWith(prefString)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

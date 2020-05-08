package it.panda.chapter1;

public class StringUtils {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String reverse(String s) {
        return new String(new StringBuilder(s).reverse());
    }

    public int countLetters(String word) {
        return word.length();
    }

    public String convertToUpperCase(String word) {
        return word.toUpperCase();
    }
}

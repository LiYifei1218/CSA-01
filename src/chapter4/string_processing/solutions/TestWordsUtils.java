package chapter4.string_processing.solutions;


import chapter4.string_processing.ArrayMethods;

public class TestWordsUtils {


    public static void main(String[] args) {


        //Test the getSubWord method
        String str = "I love Java Coding";
        System.out.println(WordsUtils.getSubWord(str,1));
        System.out.println(WordsUtils.getSubWord(str,2));
        System.out.println(WordsUtils.getSubWord(str,3));
        System.out.println(WordsUtils.getSubWord(str,4));
        System.out.println(WordsUtils.getSubWord(str,5));
        System.out.println(WordsUtils.getSubWord("Hello", 1));


        //Test the extractWords method
        ArrayMethods.printArray(WordsUtils.extractWords(str));
        ArrayMethods.printArray(WordsUtils.extractWords("Hello world"));
        ArrayMethods.printArray(WordsUtils.extractWords("Hello"));



    }
}

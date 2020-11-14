package chapter4.string_processing.student;


public class WordsUtils {



    /**
     * Returns the nth word from the given string str. Suppose the str does
     * not contains any punctuation.
     * Return null if the nth word in the string str does not exist.
     * Precodition: str.length()>0 and n>0
     * Postcondtion: the str is not modified.
     */
    public static String getSubWord(String str, int n){


        /* write your code here */
        String t = str;
        int f = 0;
        //int lastf = 0;
        for (int i = 0; i < n; i++) {
            if (t.indexOf(" ") != -1) {
                t = t.substring(t.indexOf(" "));
                //i++;
            }
        }


        return t;

    }

    /**
     * Extracts each word from the given string str and store all extracted
     * words orderly in an array to return.
     * Precodition: str does not contain any punctuation and str.length>0
     * Postcondtion: the str is not modified.
     */
    public static String[] extractWords(String str){

        /* write your code here */


        return null;
    }
}

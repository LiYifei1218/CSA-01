package chapter4.string_processing.solutions;

public class WordsUtils {




    /**
     * Returns the nth word from the given string str. Suppose the str does
     * not contains any punctuation.
     * Return null if the nth word in the string str does not exist.
     * Precodition: str.length()>0 and n>0
     * Postcondtion: the str is not modified.
     */
    public static String getSubWord(String str, int n){


        String s = new String(str);
        for (int i = 0; i < n-1; i++) {
            if(s.indexOf(" ")!=-1) {
                s = s.substring(s.indexOf(" ") + 1);
            }
            else {
                //第n个单词不存在的情况
                return null;
            }
        }

        //当要提取的是最后一个单词时，s中没有了空格
        if(s.indexOf(" ")==-1){
            return s;
        }
        else {
            return s.substring(0,s.indexOf(" "));
        }


    }


    /**
     * Extracts each word from the given string str and store all extracted
     * words orderly in an array to return.
     * Precodition: str does not contain any punctuation and str.length>0
     * Postcondtion: the str is not modified.
     */
    public static String[] extractWords(String str){

        int count = 1;
        while(getSubWord(str, count)!=null){
            count++;
        }

        String[] arr = new String[count-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getSubWord(str, i+1);
        }

        return arr;


/*        //另一种解法
        int count = 1;
        String s = getSubWord(str, count);
        ArrayList<String> list = new ArrayList<String>();
        while(s!=null){
            list.add(s);
            count++;
            s = getSubWord(str, count);
        }

        String [] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;*/

    }
}

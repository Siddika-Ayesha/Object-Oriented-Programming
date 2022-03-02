
package string;

public class Ayesha_String {

   
    public static void main(String[] args) {
    String str = "My name is Ayesha";
        System.out.println(maxWord(str));
        System.out.println(minWord(str));
    }

    public static String maxWord(String input){
        String[] str = input.split(" ");
        if (str.length==0) return null;
        String longest=" ";
        for (String word:str){

            if (word.length()>longest.length()) {
                longest=word;

            }
        }
        return longest;
    }

    public static String minWord(String input){
        String[] str = input.split(" ");
        String shortest=" ";
        for (String word:str){
            if (word.length()<shortest.length()) {
                shortest=word;

            }
        }
        return shortest;
    }
}
package practices;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together

        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"

     */

        String str = "DC501GCCCA098911";
        String result = "";
        String sortString = "";

        for (int i = 0; i < str.length(); i++) {

            result += "" + str.charAt(i);
            if (Character.isLetter(str.charAt(i)) && i< str.length()-1) {

                if (Character.isDigit(str.charAt(i + 1))) {
                    result += " ";
                }
            }
            if (Character.isDigit(str.charAt(i))  && i< str.length()-1){

                if(Character.isLetter(str.charAt(i+1))){
                    result += " ";
                }
            }


            }
        System.out.println(result);


        String[] temp = result.split(" ");
        for (String each : temp) {

            char[] temp1 = each.toCharArray();
            Arrays.sort(temp1);

            System.out.println(Arrays.toString(temp1));

            for (char eachChar : temp1) {
                sortString += "" + eachChar;
            }


        }
        System.out.println(sortString);
    }
}
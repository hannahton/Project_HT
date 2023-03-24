package practices;

import java.util.ArrayList;
import java.util.List;

public class BugHunt1 {
    /*
    /// <summary>
/// This method performs the following operations:
/// 1. Reverses the string
/// 2. Replaces contiguous spaces with a single space
/// 3. Removes any numerical characters
/// 4. Converts any uppercase characters to lower case
/// </summary>
     */
    public static void main(String[] args) {
        String str = " I love Java 11   more";

        List<Character> reverse = new ArrayList<>();

        for(int i = str.length()-1; i>=0 ; i--){

            char letter = str.charAt(i);

            if(letter>='A' && letter<='Z'){
                reverse.add(Character.toLowerCase(letter));

            }
            else if(Character.isDigit(letter)){
                reverse.add(' ');
            }
            else if(Character.isWhitespace(letter)){
                reverse.add(' ');

            }
            else{
                reverse.add(letter);
            }
        }
        String result = "";
        for (int i = 0; i< reverse.size()-1; i++) {

            if (reverse.get(i).equals(' ') && reverse.get(i+1).equals(' ')) {
                continue;
            } else {
                result += reverse.get(i) + "";
            }
        }
        System.out.print(result);

    }

}

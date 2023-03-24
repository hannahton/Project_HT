package practices;

public class BugHunt2 {
    public static void main(String[] args) {
        String str = " I  45 love Java 11   more";
        String result = "";
        boolean preSpace = false;

        for(int i = str.length()-1; i >=0; i--){
            char letter = str.charAt(i);

            if(Character.isDigit(letter)){
                result += "";

            }else if(Character.isWhitespace(letter)){
                    if(preSpace){
                        continue;
                    }else{
                        preSpace = true;
                        letter = ' ';
                    }
                result+= letter+"";

            }else if(Character.isUpperCase(letter)){
               // letter = (char)(letter+32);
                letter= Character.toLowerCase(letter);
                result += letter +"";

            }else{
                preSpace = false;
                result += letter +"";
            }
        }
        System.out.println(result);
    }
}

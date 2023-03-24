package practices;

public class HannahTon {
    public static void main(String[] args) {
        String str1= "abc";
        String str2="def";
        String str3="ghi";
        String result = str1+str2+str3;
        System.out.println(result);

        String result1 = str1.concat(str2).concat(str3);
    }
}

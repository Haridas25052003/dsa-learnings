//check that anagram or not
import java.util.Arrays;
class checkAnagram
{
    public static void main(String[]args){
        String s1="text";
        String s2="test";

        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
 
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }
}
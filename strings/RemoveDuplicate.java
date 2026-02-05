
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        String s="international";
        char ch[]=s.toCharArray();

        HashSet<Character> set=new HashSet<>();

        for(char c:ch){
            set.add(c);
        }

        System.out.println(set);
        

    }
}

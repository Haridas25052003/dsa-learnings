public class CountVowels {
    public static void main(String[] args) {
        
        String s="international";
        int vowelcount=0;
        int consonentcount=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               // System.out.print(ch+" ");
                vowelcount++;
            }
            else{
                consonentcount++;
            }
        }
        System.out.println(vowelcount);
        System.out.println(consonentcount);
    }
}

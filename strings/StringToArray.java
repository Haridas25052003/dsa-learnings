public class StringToArray {
    public static void main(String[] args) {
        
        String s="International";

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}

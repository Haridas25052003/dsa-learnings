public class ElementAppear {
    public static void main(String[] args) {
        
        int a[]={2,3,5,2,8,9,2,1,2};
        int key=2;
        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                count++;
            }
        }
        System.out.println(count);
    }
}

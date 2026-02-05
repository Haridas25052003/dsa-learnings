public class FirstOccurance {
    public static void main(String[] args) {
        
        int a[]={2,4,1,5,2,3,1};
        int key=1;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("first occurance of key: "+ i);
                break;
            }
        }

    }
}

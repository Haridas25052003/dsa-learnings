public class LinearSearch1 {
    public static void main(String[] args) {
        
        int a[]={3,6,1,8,9,7};
        int key=7;
        boolean isfound=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Element found at index: "+i);
                isfound=true;
                break;
            }
        }

        if(!isfound){
            System.out.println("Element not found");
        }
    }
}

public class SearchElement {
    public static void main(String[] args) {
        
        int a[]={3,2,7,8,5,9};
        int key=8;
        boolean found=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("element found at index: "+i);
                found=true;
                break;  
            }
        }

        if(!found){
            System.out.println("element not present in array");
        }
    }
}

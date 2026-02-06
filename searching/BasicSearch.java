public class BasicSearch {
    public static void main(String[] args) {
        
        int a[]={1,3,4,5,8,4,9,3};
        int low=0;
        int high=a.length-1;
        boolean found=false;
        int key=4;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                found=true;
                break;
            }
            else if(a[mid]<key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(found){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}

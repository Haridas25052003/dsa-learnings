public class BinarySearch {
    public static void main(String[] args) {
        
        int a[]={1,3,5,7,9,11};
        int low=0;
        int high=a.length-1;
        int key=3;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;

            if(a[mid]==key){
                found=true;
                break;
            }
            else if(key < a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        if(found){
            System.out.println("found" +key);
        }
        else{
            System.out.println("not found");
        }
    }
}

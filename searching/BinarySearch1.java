public class BinarySearch1 {
    public static void main(String[] args) {
        
        int a[]={1,3,5,7,9};
        int key=7;

        int low=0;
        int high=a.length-1;
        int index=-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(a[mid]==key){
                index=mid;
                break;
            }
            else if(key<a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(index!=-1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("element not found");
        }
    }
}

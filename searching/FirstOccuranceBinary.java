
import java.util.Arrays;

public class FirstOccuranceBinary {
    public static void main(String[]args){

        int a[]={1,2,3,2,4,2};
        int key=2;
        Arrays.sort(a);
        int low=0;
        int high=a.length-1;
       // boolean found=false;
       int firstIndex=-1;

        while(low<high){
            int mid=(low+high)/2;

            if(a[mid]==key){
               firstIndex=mid;
               //  System.out.println(i);
               high=mid-1;
            }
            else if(key < a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(firstIndex);
    }
}

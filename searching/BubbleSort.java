public class BubbleSort {
    public static void main(String[] args) {
        
        int a[]={5,3,1,2};
        int n=a.length;

        //outer loop
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    //swap
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}

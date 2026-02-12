public class BubbleSort3 {
    public static void main(String[] args) {
        
        int []a={9,2,3,1,5,6,8};
        int n=a.length;

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                
                if(a[j] > a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int x: a)
            System.out.print(x+ " ");
    }
}

public class LastIndex {
    public static void main(String[] args) {
        
        int a[]={2,6,9,1,5,6,3};
        int key=6;
        int lastindex=-1;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                lastindex=i;
            }
        }

        if(lastindex !=-1){
            System.out.println(lastindex);
        }
        else{
            System.out.println("not found");
        }
    }
}

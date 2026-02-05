class LinearSearch
{
    public static void main(String[] args) {
        
        int a[]={5,3,7,1,9};
        int key=7;
        boolean found=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Element found at index: "+i);
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("element not found");
        }


    }
}
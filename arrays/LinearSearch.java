//serach a key by using basic linear search
class LinearSearch
{
public static void main(String[]args)
{
 
   int key=7;
   Boolean found=false;
   int a[]={3,6,7,2,9,1};

   for(int i=0;i<a.length;i++){
 
       if(a[i]==key){
       found=true;
       System.out.println("index position:"+ i);
       break;
       }
    }

    System.out.println(found);
  }
}
         
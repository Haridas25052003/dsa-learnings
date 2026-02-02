//find duplicate element
class DuplicateElement
{
public static void main(String[]args)
{

     int a[]={3,2,5,6,7,2,1};
   
     int duplicate=0;
 
     for(int i=0;i<a.length;i++){

         for(int j=i+1;j<a.length;j++){

             if(a[i]==a[j]){

                System.out.println("element " +a[i] + "index: "+i);
             break;
             }
          }
       }
   }
}
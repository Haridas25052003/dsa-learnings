//find smallest element 
class smallestElement
{
public static void main(String[]args)
{

   int a[]={3,6,7,2,1,9};
   int min=a[0];

   for(int i=0;i<a.length;i++){

       if(a[i] < min){

          min=a[i];
       }
   }

   System.out.println(min);
  }
}
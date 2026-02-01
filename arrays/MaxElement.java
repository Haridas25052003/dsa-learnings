class MaxElement
{
public static void main(String[]args)
{

  int []a={3,7,2,9,5};
   
  int max=0;

  for(int i=0;i<a.length;i++){

      if(a[i]>max){

         max=a[i];

      }
   }

   System.out.println(max);
 }
}
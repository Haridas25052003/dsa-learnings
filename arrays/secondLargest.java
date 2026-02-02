//largest and second largest
class secondLargest
{
public static void main(String[]args)
{

   int a[]={3,5,2,8,9,1,7};

   int max=0;
   int secondmax=a[0];
   
   for(int i=0;i<a.length;i++){

       if(a[i] > max){

          secondmax=max;
          max=a[i];
       }

       else if(a[i] > secondmax && a[i] !=max){
  
           secondmax=a[i];
       }
    }
    
    System.out.println("max:"+max);
    System.out.println("secondmax:"+secondmax);
  }
}

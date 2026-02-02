//Input:  [12, 45, 30]
//Output: [21, 54, 03]
import java.util.Arrays;
class revNum
{
public static void main(String[]args)
{

   int a[]={12,45,30};
  

   for(int i=0;i<a.length;i++){
   
       int num=a[i];
        int rev=0;

       while(num!=0){

         rev*=10;
         rev+=num%10;
         num/=10;
       }
   
       a[i]=rev;
      
    }

    
  
        System.out.print(Arrays.toString(a));
    
  }
}
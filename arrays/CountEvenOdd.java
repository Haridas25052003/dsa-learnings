class CountEvenOdd
{
public static void main(String[]args)
{

   int a[]={3,1,4,5,8,7,2,9,11};
   
   int even=0;
   int odd=0;

   for(int i=0;i<a.length;i++){

       if(a[i]%2==0)

          even++;

       else

          odd++;

    }
    System.out.println(even);
    System.out.println(odd);
  }
}
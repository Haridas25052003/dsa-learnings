//missing number from the array
class missingNum
{
public static void main(String[]args)
{
  
  int a[]={1,2,3,5};

  int n=5;

  int sum=0;
  int actualSum=n*(n+1)/2;

  for(int i=0;i<a.length;i++){

      sum+=a[i];

  }

  int missingNumber=actualSum-sum;

  System.out.println(missingNumber);
 }
}       
//frequency of elements 
import java.util.HashSet;
class freq
{
public static void main(String[]args)
{
    int a[]={3,7,2,1,2,3,5,5};
    //int count=0;
    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<a.length;i++){

        set.add(a[i]);
        
    
     }

     for(int i=0;i<a.length;i++){ 

       int count=0;

         for(int j=i+1;j<a.length;j++){

             if(a[i]==a[j])

                count++;
         }
     }
     System.out.println(set+ " "+ count);       
  }
}

     
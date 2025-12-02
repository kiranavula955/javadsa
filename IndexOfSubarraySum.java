public class IndexOfSubarraySum {
   static int[] indexOfSubarraySum(int[] a,int target){
    int i=0,j=0;
    int sum=0;
    while(i<a.length){
        sum+=a[i];
        while(sum>target){
            
            sum-=a[j];
            j++;
            if(sum==target) return new int[]{j+1,i+1};
        }
        //if(sum==target) return
        i++;
    }
    return new int[2];
   } 

   public static void main(String[] args) {
    int[] a={1,2,3,4,5};
    int[] b=indexOfSubarraySum(a,9);
    for(int i:b) System.out.print(i +" ");

   }
}

public class LeftAndRightSumDifference {
    public static int[] leftAndRightSumDifference(int[] a){
        int[] prifix=new int[a.length];
        int[] suffix=new int[a.length];
        int sum=a[0];
        for(int i=1;i<a.length-1;i++){
           prifix[i]=sum;
            sum+=a[i];
            
        }
        prifix[a.length-1]=sum;
	sum=a[a.length-1];
        for(int i=a.length-2;i>0;i--){
            suffix[i]=sum;
            sum+=a[i];
            
        }
	suffix[0]=sum;

	for(int i=0;i<a.length;i++){
		a[i]=Math.abs(suffix[i]-prifix[i]);
	}
        return a;
    }
    public static void main(String[] args){
        int[] a={10,4,8,3};
	leftAndRightSumDifference(a);
	for(int i:a){
		System.out.print(i+" ");
	}
       // System.out.println(leftAndRightSumDifference(a));
    }

}

class MaximumProductSubArray{
	public static int MaximumProductSubArray(int[] n){
		int i=0,j=n.length-1,max=1;
		int lsum=1,rsum=1;
		while(i<n.length|| j>=0){
			lsum*=n[i++]; if(lsum==0) lsum=1;
			rsum*=n[j--]; if(rsum==0) rsum=1;
			int maxs=Math.max(lsum,rsum);
			max=Math.max(maxs,max);
		}
		return max;

	}

	public static void main(String[] arg){
		int[] a={-1,-3,-10,0,6};

		System.out.println(MaximumProductSubArray(a));
	}
}		


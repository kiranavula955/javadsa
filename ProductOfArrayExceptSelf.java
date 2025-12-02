public class ProductOfArrayExceptSelf {
    static int[] ProductOfArrayExceptSelf(int[] a){
        int[] prefix=new int[a.length];
        int[] suffix=new int[a.length];
        int sum=1;
        for(int i=0;i<a.length;i++){
            sum*=a[i];
             if(sum==0) sum=1;
            prefix[i]=sum;
           
        }
        sum=1;
        for(int i=a.length-1;i>=0;i--){
            sum*=a[i];
             if(sum==0) sum=1;
            suffix[i]=sum;
            
        }

        for(int i=0;i<a.length;i++){
            if(i==0||i==a.length-1){
                if(i==0){
                    a[i]=suffix[1];
                }else a[i]=prefix[a.length-2];
            }else
            a[i]=prefix[i-1]*suffix[i+1];
        }
        return a;
    }

    public static void main(String[] arg){
        int[] a={1,2,3,4};
        a=ProductOfArrayExceptSelf(a);
        for(int i:a){
            System.out.print(i+" ");
        }
        
    }
    
}

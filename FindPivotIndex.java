public class FindPivotIndex {

    static int findPivotIndex(int[] a){
        int[] prefix=new int[a.length];
        int[] suffix=new int[a.length];
        int sum=a[0];
        int index=-1;
        for(int i=1;i<a.length;i++){
            prefix[i]=sum;
            sum+=a[i];
        }
        sum=a[a.length-1];
        for(int j=a.length-2;j>=0;j--){
            suffix[j]=sum;
            sum+=a[j];
        }

        for(int i=0;i<a.length;i++){
            if(suffix[i]==prefix[i]) return i;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a={1,7,3,6,5,6};
        System.out.println(findPivotIndex(a));
    }
    
}

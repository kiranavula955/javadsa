public class RemoveDuplicatesFromSortedArray {
    
    static int removeDuplicatesFromSortedArray(int[] a){
        int i=0,j=0;
        for(j=0;j<a.length;j++){
            if(a[i]!=a[j]){
                a[++i]=a[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[]a={1,1,2,2,3,4,4,5};
        int i=removeDuplicatesFromSortedArray(a);

        for(int j=0;j<=i;j++){
            System.out.print(a[j]+" ");
        }
    }
}

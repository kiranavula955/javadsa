public class MoveZeroesToEnd {
    static int[] moveZeroesToEnd(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] arg){
        int[] a={0,1,0,3,12};
        a=moveZeroesToEnd(a);
        for(int i:a)
        System.out.print(i);
    }
}

public class PowerOfTwo {
    static boolean powerOfTwo(int n){
      
       return  (n!=-2147483648 )&&(n != 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] a){
        System.out.println(powerOfTwo(2));
        System.out.println(powerOfTwo(5));
    }
}

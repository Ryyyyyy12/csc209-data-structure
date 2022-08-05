public class RecursionLab {
    public static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static int exponential(int a,int b){
        if(b==0) return 1;
        return a*exponential(a,b-1);
    }
    public static int divide(int dividend,int divisor){
        int count=0;
        for(count=0;dividend>=divisor;count++){
            dividend-=divisor;
        }
        return count;
    }
    public static int recursivelyDivide(int dividend,int divisor){
        if(dividend<divisor)return 0;
        return recursivelyDivide(dividend-divisor,divisor)+1;
    }
    public static void printNto1(int n){
        if(n>0){
            System.out.print(n+" ");
            printNto1(n-1);
        }
    }
    public static void print1toN(int n){
        if(n>=1){
            print1toN(n-1);
        }
        if(n%2!=0){
            System.out.println(n);
        }
    }
    public static String printOdd(int n){
        if(n>0){
            if(n%2==0){
                return printOdd(n-1);
            }else {
                return printOdd(n-1)+""+n;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exponential(2,10));
        System.out.println(divide(24,6));
        System.out.println(recursivelyDivide(25,6));
        printNto1(10);
        System.out.println();
        print1toN(10);
        //System.out.print(printOdd(10));

        //fibonancii without recursive
        /*int[] arr = new int[7];
        for(int i=0;i<7;i++){
            if(i>=2){
                arr[i] = arr[i-2] + arr[i-1];
            }else {
                arr[i] = i;
            }
        }
        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
        }*/
    }
}

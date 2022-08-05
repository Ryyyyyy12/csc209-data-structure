public class Quicksort {
    public static void main(String[] args) {
        int[] data = { 69,200,44,1000,3,256,400,500,24,55,222,8,10,111,123,1,205};
        printAll(data);
        quicksort(data,0,data.length-1);
        printAll(data);
    }
    public static void printAll(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int[] a,int first,int last){
        if(first>=last){ //anchor:No more recursion
            return;
        }
        int pivot = first;
        int lower = first+1;
        int upper = last;
        while (lower <= upper){
            while ( lower<=last && a[lower] < a[pivot]){
                //search for a big number that is bigger than or equal the pivot
                lower++;
            }
            while ( upper >= first && a[upper] > a[pivot]){
                //search for a smaller number that is smaller than pivot
                upper--;
            }
            if(lower < upper){
                //lower has not passed the upper
                //swap
                int temp =a[lower];
                a[lower] = a[upper];
                a[upper] = temp;

                lower++;
                upper--;
            }
        }
        //swap pivot with the upper
        int temp =a[pivot];
        a[pivot] = a[upper];
        a[upper] = temp;

        quicksort(a,first,upper-1);
        quicksort(a,upper+1,last);
    }
}

public class ElementarySorting {
    public static void main(String[] args) {
        int[] data = {40,55,12,500,300,29,46,88,79,92,30,56,1000,49};
        int[] data2 = data.clone();
        int[] data3 = data.clone();
        print(data);

        selectionSort(data);
        print(data);

        print(data2);
        insertionSort(data2);
        print(data2);

        print(data3);
        bubbleSort(data3);
        print(data3);
    }
    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for (int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            int insertingItem = a[i];
            int j;
            for (j=i-1;j>=0 && a[j]>insertingItem;j--){
                a[j+1] = a[j];
            }
            a[j+1] = insertingItem;
        }
    }
    public static void selectionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int smallestIndex =i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[smallestIndex]){
                    smallestIndex = j;
                }
            }
            //swap between a[i] and the a[smallestIndex]
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
    }

    public static void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

package homework5;
//  Реализовать алгоритм сортировки слиянием (MergeSort).
public class task3 {
    public static void main(String[] args) {
        int[] array = {10,1,5,22,56,2,8,7,0,44,11,45};
        System.out.println("Исходный массив:");
        printArr(array);
        mergeSort(array);
        System.out.println("Отсортированный массив:");
        printArr(array);
    }
    public static void mergeSort(int[] arr) {
        int sizeArr = arr.length;
        if (sizeArr == 1) {
            return;
        }
        int middle = sizeArr / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[sizeArr - middle];

        for (int i = 0; i < middle; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = 0; i < sizeArr - middle; i++) {
            rightArr[i] = arr[middle + i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);
    }
    public static void merge(int[] a, int[]l, int[]r) {
        int leftArrSize = l.length;
        int rightArrSize = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < leftArrSize && j < rightArrSize) {
            if(l[i] < r[j]) {
                a[idx] = l[i];
                i++;
                idx++;
            } else {
                a[idx] = r[j];
                j++;
                idx++;
            }
        }

        for (int ll = i; ll < leftArrSize; ll++) {
            a[idx++] = l[ll];
        }

        for (int rr = j; rr < rightArrSize; rr++) {
            a[idx++] = r[rr];
        }
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}

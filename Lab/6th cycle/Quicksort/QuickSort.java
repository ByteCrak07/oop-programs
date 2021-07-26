import java.util.Scanner;

public class QuickSort {
    void quicksort(String array[],int left, int right){
        if(left>=right)
            return;
        String pivot = array[(left+right)/2];
        int index = partition(array,left,right,pivot);
        quicksort(array, left,index -1);
        quicksort(array, index, right);
    }

    int partition(String array[],int left,int right, String pivot){
        while (left<=right){
            while (array[left].compareToIgnoreCase(pivot)<0)
                left++;
            while (array[left].compareToIgnoreCase(pivot)>0)
                right--;
            if(left<=right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    void swap(String array[],int left,int right){
        String temp;
        temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QuickSort qs =new QuickSort();
        String array[] = new String[5];
        int i;
        System.out.println("Enter 5 strings: ");
        for (i=0;i<5;i++){
            array[i] = in.nextLine();
        }
        qs.quicksort(array,0,array.length-1);
        System.out.print("Sorted array: ");
        for(i = 0;i<5;i++){
            System.out.print(array[i]+" ");
        }
        in.close();
    }
}
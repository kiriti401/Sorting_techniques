import java.util.Arrays;

/*for the selection sort we will be select max element and move to the ends
input=[5,4,3,2,1]
index= 0 1 2 3 4
Explanation:
In the first iteration, we find the maximum (5) and place it at index 4.
Second iteration, max of remaining [4, 3, 2, 1] is 4, place it at index 3.
Continue until the array is sorted.
space complexity=O(1)
Time complexity=O(n^2)
*/
public class Selectionsort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,3,2,1};
        System.out.println(Arrays.toString(select(arr)));
    }
    static int[] select(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int last=n-i-1;
            int max=checkingmax(arr,0,last);
            swap(arr,max,last);
        }
        return arr;
    }
    static int checkingmax(int [] arr,int start,int last){
        int max=0;
        int maxidx=0;
        for(int i=start;i<=last;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        return maxidx;
    }
    static void swap(int[] arr,int max,int last){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
}

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={5,2,3,6,1,5,7};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        boolean sortingdone;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sortingdone=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sortingdone=true;
                }
            }
            if(!sortingdone){
                break;
            }
        }
        return arr;
    }
}

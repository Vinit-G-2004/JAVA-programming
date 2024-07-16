public class mergeSort {

    public static void printArr(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeS(int arr[],int si,int ei)
    {
        if (si>=ei) {
            return;
        }
        int mid = (si+ei)/2;
        mergeS(arr, si, mid);
        mergeS(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si, int mid, int ei)
    {
        int temp[]=new int[ei-si+1];
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
    }
}

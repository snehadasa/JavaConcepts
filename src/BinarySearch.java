
public class BinarySearch {

    public static int binarySearch(int []arr, int x) {
        return binarySearch(arr, x, 0, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int x, int i, int j) {
        int left = i, right = j;
        while (left <= right) {
            int middle = left + (right - left)/2;


            if(arr[middle] == x) {
                return middle;
            }

            if (arr[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;

    }

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int arr[] = {2, 3, 4, 44, 59, 100};
//        int x = 44;
//        BinarySearch bs = new BinarySearch();
//        int res = bs.binarySearch(arr, x);
//        if (res == -1) {
//            System.out.println("Oh no");
//        } else {
//            System.out.println(res);
//        }
//    }

}

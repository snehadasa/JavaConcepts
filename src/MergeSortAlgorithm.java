import java.util.*;

public class MergeSortAlgorithm {
    //Based on Divide and conquer algorithm
//    public void merge(int[] arr, int left, int middle, int right) {
//        int n1 = middle - left + 1;
//        int n2 = right - middle;
//
//        int[] EmptyL = new int[n1];
//        int[] EmptyR = new int[n2];
//
//        for (int i=0; i < n1; ++i)
//            EmptyL[i] = arr[left + i];
//        for (int j = 0; j < n2; ++j)
//            EmptyR[j] = arr[middle + 1 + j];
//
//        int i = 0, j = 0;
//        int k = left;

    //}

    public static List<Integer> mergeSort(List <Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> split = split(arr);
        List<Integer> sorted_split_1 = mergeSort(split.get(0));
        List<Integer> sorted_split_2 = mergeSort(split.get(1));
        return mergeTwoSortedArrays(sorted_split_1, sorted_split_2);
    }

    public static List<List<Integer>> split(List <Integer> arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.size()/2; i++) {
            list1.add(arr.get(i));
        }
        for (int i = arr.size()/2; i < arr.size(); i++) {
            list2.add(arr.get(i));
        }
        result.add(list1);
        result.add(list2);

        return result;
    }

    public static List<Integer>  mergeTwoSortedArrays(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> arr3 = new ArrayList<>();
        int arr1_index = 0, arr2_index = 0;
        while (arr1_index < arr1.size() && arr2_index < arr2.size()) {
            if (arr1.get(arr1_index) < arr2.get(arr2_index)) {
                arr3.add(arr1.get(arr1_index));
                arr1_index++;
            } else {
                arr3.add(arr2.get(arr2_index));
                arr2_index++;
            }
        }
        while (arr1_index < arr1.size()) {
            arr3.add(arr1.get(arr1_index));
            arr1_index++;
        }

        while (arr2_index < arr2.size()) {
            arr3.add(arr2.get(arr2_index));
            arr2_index++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        Integer[] arr2 = {11, 13, 14, 15, 16, 17};
        Integer[] arr1 = {1, 5, 7};
        List<Integer> arr3 = mergeTwoSortedArrays(Arrays.asList(arr1), Arrays.asList(arr2));
        System.out.println(arr3);

        ///
        Integer []unsorted_array = {34,45,2,4,76,23};
        List<Integer> sorted_array = mergeSort(Arrays.asList(unsorted_array));
        System.out.println(sorted_array);
    }
}

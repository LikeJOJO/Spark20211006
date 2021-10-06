package first_1;

public class ForeverKiss {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] {1, 3, 5, 9, 5, 2, 6};
        String[] arr2 = new String[] {"a", "g", "d", "e", "b"};
        MathUtils.bubbleSort(arr1);
        for (Integer integer : arr1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        MathUtils.bubbleSort(arr2);
        for (String s : arr2) {
            System.out.print(s + " ");
        }
    }
}

class MathUtils {
    public static <T extends Comparable> void bubbleSort(T[] arr) {
        //当数组为空或仅有1个元素时，完全不要任何操作
        if (arr.length == 0 || arr.length == 1) return;
        //最外层控制循环判断次数
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) break;
        }
    }

    public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

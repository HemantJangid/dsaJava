import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 6, 8, 7, 9, 1, 3, 2};
        int n = a.length;
        int s = 0;
        int e = n - 1;

        int[] ans = mergesort(a, s, e);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergesort(int[] a, int s, int e) {
        int[] ans;
        if ( s== e) {
            ans = new int[]{a[s]};
            return ans;
        }
        int mid = (s + e) / 2;
        int[] leftArr = mergesort(a, s, mid);
        int[] rightArr = mergesort(a, mid + 1, e);
        ans = merge(leftArr, rightArr);
        return ans;
    }

    static int[] merge(int[] leftArr, int[] rightArr) {
        int[] res = new int[leftArr.length + rightArr.length];
        int s1 = 0, s2 = 0;
        int i = 0;
        while (s1 < leftArr.length && s2 < rightArr.length) {
            if (leftArr[s1] <= rightArr[s2]) {
                res[i] = leftArr[s1];
                s1++;
            } else {
                res[i] = rightArr[s2];
                s2++;
            }
            i++;
        }

        for (int j = s1; j < leftArr.length; j++) {
            res[i] = leftArr[s1];
            i++;
        }

        for (int j = s2; j < rightArr.length; j++) {
            res[i] = rightArr[s2];
            i++;
        }

        return res;
    }
}

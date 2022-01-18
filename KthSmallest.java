//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

public class KthSmallest {
    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3, 20, 15};
        int n = a.length;
        int k = 3, l = 0, r = n - 1;
        int ans = kthSmallest(a, k, l, r);
        System.out.println(ans);
    }

    static int kthSmallest(int[] a, int k, int l, int r) {
        int i = l - 1, j = l, p = r;
        while (i <= r && j <= r) {
            if (a[j] <= a[p]) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                if (j == p) p = i;
            }
            j++;
        }
        if (p == k - 1)
            return a[p];
        else if (p < k - 1)
            l = p + 1;
        else
            r = p - 1;
        return kthSmallest(a, k, l, r);
    }
}

//https://practice.geeksforgeeks.org/problems/3d27d4683c121c1f152ee8f41279255dc4430cf6/1/

public class TernarySearch {
    public static void main(String[] args) {
        int[] a = {3, 5, 5, 6, 7, 9, 10, 10, 12, 14, 14, 15, 15, 18, 21, 21, 22, 26, 28};
        int n = a.length;
        int k = 26;

        int ans = ternarySearch(a, n, k);
        System.out.println(ans);
    }

    static int ternarySearch(int[] arr, int N, int K) {
        // Your code here
        int l = 0, r = N - 1;
        while (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (arr[mid1] == K) return 1;
            if (arr[mid2] == K) return 1;
            if (K < arr[mid1]) r = mid1 - 1;
            else if (K > arr[mid2]) l = mid2 + 1;
            else {
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
        return -1;
    }
}

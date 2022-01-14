//https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

public class AllocateBooksContigously {
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 90};
        int n = a.length;
        int m = 2;

        int ans = findPages(a, n, m);
        System.out.println(ans);
    }

    static int findPages(int[] a, int n, int m) {
        int totalPages = 0;
        for (int pages : a) totalPages += pages;

        int l = 0, h = totalPages;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (allocationPossible(a, n, m, mid)) {
                h = mid - 1;
            } else l = mid + 1;
        }
        return l;
    }

    static boolean allocationPossible(int[] a, int n, int m, int maxPages) {
        int count = 1, pages = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > maxPages) return false;
            if (pages + a[i] > maxPages) {
                count++;
                pages = a[i];
            }
            else pages += a[i];
        }
        return count == m;
    }
}

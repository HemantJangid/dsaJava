//https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int l = 0;
        int h = a.length - 1;
        int ans = -1;
        int key = 11;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) ans = mid;
            if (a[mid] >= a[l]) {
                if (key >= a[l] && key <= a[mid]) h = mid - 1;
                else l = mid + 1;
            } else {
                if (key >= a[mid] && key <= a[h]) l = mid + 1;
                else h = mid - 1;
            }
        }
        System.out.println(ans);
    }
}

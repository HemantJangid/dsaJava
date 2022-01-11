//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 5, 5, 6, 6, 7};
        int target = 5;
        int firstIndex = findIndex(arr, target, -1);
        int lastIndex = findIndex(arr, target, 1);

        System.out.println(firstIndex + " " + lastIndex);
    }

    static int findIndex(int[] a, int target, int tog) {
        int start = 0;
        int end = a.length-1;
        int ans = -1;

        while(start <= end) {
            int mid = (start+end)/2;
            if(target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(tog == -1) end = mid + tog;
                else start = mid + tog;
            }
        }
        return ans;
    }
}

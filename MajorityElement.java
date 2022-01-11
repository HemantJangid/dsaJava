//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 2, 3, 2, 3, 2};
        int n = a.length;

        int me = a[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            count = a[i] == me ? count + 1 : count - 1;

            if (count == 0) {
                me = a[i];
                count = 1;
            }
        }

        count = 0;
        for (int num : a) {
            if (num == me) count++;
        }
        System.out.println(count > n / 2 ? me : -1);

    }
}

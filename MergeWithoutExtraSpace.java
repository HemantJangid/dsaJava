import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {10, 12};
        int[] arr2 = {5, 6, 7, 8, 20};
        int n = arr1.length;
        int m = arr2.length;

        int gap  =  n+m;
        int i = 0, j = 0;
        for(gap = nextGap(gap); gap>0; gap = nextGap(gap)) {
            for(i = 0; i+gap<n; i++) {
                if(arr1[i] > arr1[i+gap])
                    arr1[i] += arr1[i+gap] -  (arr1[i+gap] = arr1[i]);
            }

            for(j = (gap >n) ? (gap-n):0; i<n && j<m; i++, j++) {
                if(arr1[i] > arr2[j])
                    arr1[i] += arr2[j] - (arr2[j] = arr1[i]);
            }
            if(j < m) {
                for(j = 0; j+gap<m; j++) {
                    if(arr2[j] > arr2[j+gap])
                        arr2[j] += arr2[j+gap] - (arr2[gap+j] = arr2[j]);
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static int nextGap(int gap) {
        if(gap <= 1)
            return 0;
        return (gap/2 + gap%2);
    }
}

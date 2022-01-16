//https://practice.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1/

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{ 3, 30, 38},
                          {36, 43, 60},
                          {40, 51, 69}};

        int n = matrix.length, m = matrix[0].length;
        int x = 60;
        int ans = search(matrix, n, m, x);
        System.out.println(ans);
    }

    static int search(int[][] matrix, int n, int m, int x){

        int i=n-1, j=0;
        while(i>=0 && j<m) {
            int num = matrix[i][j];
            if (num == x) return 1;
            else if (num < x) j++;
            else i--;
        }
        return 0;
    }
}

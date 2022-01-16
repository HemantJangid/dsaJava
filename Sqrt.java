//https://practice.geeksforgeeks.org/problems/square-root/1

public class Sqrt {
    public static void main(String[] args) {
        long x = 25;

        long s = 1, e=x, ans = 0;
        while(s<=e) {
            long mid = (s+e)/2;
            long sqr = mid*mid;
            if(sqr == x) {
                ans = mid;
                break;
            } else if (sqr < x) {
                s = mid+1;
                ans = mid;
            } else e = mid-1;
        }

        System.out.println(ans);
    }
}

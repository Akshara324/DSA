public class Badversion {

    // Example API (normally provided)
    static boolean isBadVersion(int version) {
        int bad = 4; // assume version 4 is the first bad version
        return version >= bad;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;   // first bad is at mid or before
            } else {
                left = mid + 1; // first bad is after mid
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("First Bad Version: " + firstBadVersion(n));
    }
}
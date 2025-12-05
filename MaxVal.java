public class MaxVal {
    static int max(int a[], int i) {
        if(i == 0)
            return a[0];
        return Math.max(a[i], max(a, i-1));
    }
    public static void main(String args[]) {
        int a[] = {5, 2, 9, 1, 7};
        System.out.println(max(a, a.length-1));
    }
}


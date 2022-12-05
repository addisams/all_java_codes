public class SmallestEvenMultiole {
    public static void main(String[] args) {
        int n=6;
        System.out.println(smallestEvenMultiple(n));

    }
    static int smallestEvenMultiple(int n) {
        if(n%2==0)
        {
            return n;
        }
        else if(n%2!=0)
        {
            return 2*n;
        }
        return 0;
    }
}

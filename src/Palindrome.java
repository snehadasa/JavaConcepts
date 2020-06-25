public class Palindrome {

    public boolean ispalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revnum = 0;
        while(x > revnum) {
            revnum = revnum * 10 + x % 10;
            x /= 10;
        }
        return x == revnum || x == revnum/10;
    }

    public static void main(String[] args) {
        int num = -474;
        boolean res = new Palindrome().ispalindrome(num);
        System.out.println(res);

    }
}

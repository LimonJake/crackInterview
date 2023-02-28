public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        // AND &
        // In binary 9 = 1001
        // In binary 7 = 0111
        // Result      = 0001 = 1 en decimal
        System.out.println(a&b);

        // OR
        // In binary 9 = 1001
        // In binary 7 = 0111
        // Result      = 1111 = 15
        System.out.println(a|b);

        // XOR
        // In binary 9 = 1001
        // In binary 7 = 0111
        // Result      = 1110 = 14
        System.out.println(a^b);

        // NOT
        // In binary 9 = 0000 1001
        // Result      = 1111 1010 = -6
        System.out.println(~a);

        // Signed Left Shift
        int left = 3;
        System.out.println(Integer.toBinaryString(left));
        int r = left << 1;
        System.out.println(Integer.toBinaryString(r));
        System.out.println(r);

        //Signed Right Shift
        int right = -12;
        int res = right >> 1;
        System.out.println(Integer.toBinaryString(res));
        System.out.println(res);

        int rrr = right >>> 2;
        System.out.println(rrr);


        int val = 'j';
        System.out.println(val -'a');
    }
}

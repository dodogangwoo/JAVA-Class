public class variables {

    public static void main(String[] args) {
        final int MAX_SIZE = 100;

        System.out.println("상수 1 : " + MAX_SIZE);
        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
        System.out.println(3147483647L + 3147483648L);
        System.out.println(3.0004999D + 2.0004999D);
        System.out.println(3.0004999F + 2.0004999F);
        System.out.println("AB" + '\b' + 'c');
        System.out.println("AB" + '\t' + 'c');
        System.out.println("AB" + '\n' + 'c');
        System.out.println("AB" + '\r' + 'c');

        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);

        double pi = 3.1415;
        int wholeNumber = (int)pi;

        long num01 = 3000000007L;
        int num02 = (int)num01;

        short num001 = 1;
        short num002 = 2;
        short num003 = (short)(num001 + num002);

        int n1 = 7;
        int n2 = 3;

        System.out.println("n1 + n2 = " + (n1 + n2));
        System.out.println("n1 - n2 = " + (n1 - n2));
        System.out.println("n1 * n2 = " + (n1 * n2));
        System.out.println("n1 / n2 = " + (n1 / n2));
        System.out.println("n1 % n2 = " + (n1 % n2));

        short num = 10;
        num = (short)(num + 77L);
        int rate = 3;
        rate = (int)(rate * 3.5);
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num +=77L;
        rate = 3;
        rate *= 3.5;
        System.out.println(num);
        System.out.println(rate);
    }
}

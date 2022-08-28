package CompanyTest;

public class Power {

//}

    //Power of four:

    public boolean isPowerOfFour(int n) {
        if (n > 1) while (n % 4 == 0) n /= 4;
        return n == 1;
    }

    // Power of three

    public boolean isPowerOfThree(int n) {
        if (n > 1) while (n % 3 == 0) n /= 3;
        return n == 1;
    }

    //Power of two

    public boolean isPowerOfTwo(int n) {
        if (n > 1) while (n % 2 == 0) n /= 2;
        return n == 1;
    }
}


public class Palindrome {
    public static void main(String[] args) {
        int angka = 36163;
        int temp = angka;
        int remainder;
        int reverse = 0;
        while (angka > 0){
            remainder = angka%10;
            reverse = reverse * 10 + remainder;
        angka=angka /10;
    }

    if (temp==reverse)
        System.out.println("True");
    else
        System.out.println("False");
    }
}

// Output : True

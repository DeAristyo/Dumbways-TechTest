public class Palindrom {
        public static void main(String[] args) {
            int integer = 36163;
            int temp = integer;
            int remainder;
            int reverse = 0;
            while (integer > 0){
                remainder = integer%10;
                reverse = reverse * 10 + remainder;
            integer=integer /10;
        }
    
        if (temp==reverse)
            System.out.println("True");
        else
            System.out.println("False");
        }
}

// Output : True

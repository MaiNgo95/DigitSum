class Main {
   public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {

            //125 /10 = 12 -? 12 * 10 = 120 -> 125- 120 =5 is the last digit
            int digit = number % 10; //module 125 % 10 = 5 the remain number
            sum += digit; //add the last digit into the sum

            number /= 10; //number = number/ 10; //125/10 =12
        }

        return sum;

    }


    public static void main(String []args){
        System.out.println("sum = " + sumDigit(125));
    }
}

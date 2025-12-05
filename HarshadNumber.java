//sum of the number of the factors = given number is known as Harshad Number
class HarshadNumber {
    public static void main(String[] args) {
        int num=3;
        int temp = num;
        int sum = 0;
        while (temp!=0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        if (num%sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }
    }
}

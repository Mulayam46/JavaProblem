public class Que_4 {
    public static void main(String args[]){
        int  digit =1234;
        System.out.println("Digit="+digit);
        int sum=digit%10+digit/10%10+digit/100%10+digit/1000;
        System.out.println("Sum of the digit="+sum);

    }
}

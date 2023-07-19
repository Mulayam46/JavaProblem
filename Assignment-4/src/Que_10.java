public class Que_10 {
    public static void main(String []args){
        int a=51;
         if(a%5==0 && a%7==0)
            System.out.println("It is divisible by both 5 and 7");
         else if(a%5==0)
            System.out.println("It is divisible by 5 not 7");
         else if(a%7==0)
            System.out.println("It is divisible by 7 not 5");

         else
            System.out.println("It is not divisible by 5 and 7");
    }
}

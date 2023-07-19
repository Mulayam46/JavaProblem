public class Que_4 {
    public static void main(String args[]){
        int a=10,b=15;
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap without third variable");
        System.out.println("a="+a+" b="+b);
    }
}

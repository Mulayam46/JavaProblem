
class Complex{
     int real,img;
     void setValueOfComplex(int x,int y){
         real =x;
         img = y;
     }
     void printComplexValue(){
         System.out.println("real="+real);
         System.out.println("img="+img);
     }
}
public class Que_1 {
    public static void main(String args[]){
        Complex c1=new Complex();
        c1.setValueOfComplex(5,8);
        c1.printComplexValue();
    }
}

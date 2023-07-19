
public class Complex {

    int  real;
    double img;
    public void setValue(int  real,double img){
        this.real = real;
        this.img=img;
    }
    public void cPrint(){
        System.out.println("Hi");
        System.out.println("real="+real);
        System.out.println("img="+img);
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Complex c1= new Complex();
        c1.real=5;
        c1.img=45.34543534;
        c1.cPrint();
    }
}

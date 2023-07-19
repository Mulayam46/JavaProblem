public class Que_5_6_7_8 {
    public static void main(String args[]){
        //Que-5;
       // System.out.println(-5>4>3); this expression is not possible
        System.out.println(-5>4);

        //Que-6
        int x=(int)5.55;//it is true
      //  int x=(int)true; boolean to int ya int to boolean type cast not possible
        System.out.println(x);

      //Que-7
        // int z= !5>-2;
        boolean y= 5>-2;
        System.out.println(y);

        //Qie-8
        double m=5.5%1.5;//it is possible
      //  int n=5.5%1.5; //it is not possible
        System.out.println(m);
    }
}
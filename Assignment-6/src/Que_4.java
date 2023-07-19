public class Que_4 {
    public static void main(String arg[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

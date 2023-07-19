public class Cuboid {
    private double length,breadth,height;
    public double getLength(){
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void volumeOfCoboid(){
        System.out.println(length*breadth*height);
    }
    public void surfaceAreaOfCuboid(){
        System.out.println(2*(length*breadth+breadth*height+height*length));
    }/*
    public static void main(String[] args){
        Cuboid c1= new Cuboid();
        c1.setLength(1);
        c1.setBreadth(2);
        c1.setHeight(3);
        System.out.println(c1.length);
        System.out.println(c1.breadth);
        System.out.println(c1.height);
        c1.volumeOfCoboid();
        c1.surfaceAreaOfCuboid();
//        c1.setLength(4);
//        c1.setBreadth(5);
//        c1.setHeight(6);
//        System.out.println(c1.getLength());
//        System.out.println(c1.getBreadth());
//        System.out.println(c1.getHeight());
//        c1.volumeOfCoboid();
//        c1.surfaceAreaOfCuboid();
    }*/
    //class User{
        public static void main(String[] args) {
            Cuboid c1=new Cuboid();
            c1.setLength(1);
            c1.setBreadth(2);
            c1.setHeight(3);
            System.out.println("Length="+c1.getLength());
            System.out.println("Breadth="+c1.getBreadth());
            System.out.println("Height="+c1.getHeight());
        }
    }


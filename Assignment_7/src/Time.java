public class Time {
    private int hr,min,sec;
    public void setTime(int hr,int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
   /* public void setTime(int x, int y, int z){
        hr=x;
        min=y;
        sec=z;
    }*/
    public void DisplayTime(){
        System.out.print(hr+"hr");
        System.out.print(min+"min");
        System.out.print(sec+"sec");
    }
    public static void main(String[] args) {
        Time t1= new Time();
       t1.setTime(11,1 , 15);
        t1.DisplayTime();
    }
}

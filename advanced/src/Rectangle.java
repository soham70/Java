public class Rectangle {

    public int calcArea(int h,int w)
    {
        return h*w;
    }

    public int calcPeri(int h,int w)
    {
        return 2*h*w;
    }

    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();
        int ans=rec.calcArea(5,10);
        System.out.println(ans);
        System.out.println("Perimeter: " + rec.calcPeri(5,10));

    }


}

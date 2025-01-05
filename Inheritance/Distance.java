
public class Distance
{
    public static void main(String[] args)
    {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();
        d1.setDistance(5, 300);
        d2.setDistance(4, 800);
        d3 = d2.addDistance(d1);
        d3.showDistance();
    }
}
class demo

{
    int m;
    int km;
    void setDistance(int i, int j)
    {
        km = i;
        m = j;
    }
    void showDistance()
    {
        System.out.println("Distance is :" + km + ":" + m);
    }
    demo addDistance(demo d)
    {
        demo temp = new demo();
        temp.m = m + d.m;
        temp.km = km + d.km + (temp.m / 1000);
        temp.m = temp.m % 1000;
        return temp;
    }


}
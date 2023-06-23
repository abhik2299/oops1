package assignment;

public class Compare {
    public void CompareTo(double a, double b) {
        if (a == b)
            System.out.println("lines are equal");
        else if (a > b)
            System.out.println("line1 is greater than Line2");
        else
            System.out.println("Line 2 is greater than Line1");
    }

    public static void main(String[] args) {
        lengthcalculation obj=new lengthcalculation();
        double a= obj.cartesian(2,9,4,5);
        double b= obj.cartesian(-1,-2,-3,-4);
        Compare obj2=new Compare();
        obj2.CompareTo(a,b);
    }
}

package assignment;

public class Cartesian {
    public void Equals(double a,double b){
        if(a==b)
            System.out.println("lines are equal");
        else
            System.out.println("lines are not equal");

    }

    public static void main(String[] args) {
        lengthcalculation obj=new lengthcalculation();
        double a= obj.cartesian(1,2,3,4);
        double b= obj.cartesian(-1,-2,-3,-4);
        Cartesian obj2=new Cartesian();
        obj2.Equals(a,b);
    }
}

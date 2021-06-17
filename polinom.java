import java.util.Scanner;

public class Main{
    static Scanner tr = new Scanner(System.in);
    public static void main(String[] args){
        double a = tr.nextDouble();
        double b = tr.nextDouble();
        double c = tr.nextDouble();
        affichage(a,b,c);
    }
    public static void affichage(double x, double y, double z){
        double cc = alpha(x,y,z);
        System.out.println("alpha: "+cc);
        double cc10 = beta(cc,x,y,z);
        System.out.println("beta: "+cc10);
        System.out.println(x+"*(x-"+cc+")^2+"+cc10);
        double cc11 = discri(x,y,z);
        System.out.println("discriminant: "+cc11);
    }
    public static double alpha(double x1, double y1, double z1){
        double cc2 = (-y1)/(2*x1);
        return cc2;
    }
    public static double beta(double xx, double x2, double y2, double z2){
        double cc3 = (x2*(xx*xx))+(x2*(xx))+z2;
        return cc3;
    }
    public static double discri(double x3, double y3, double z3){
        double cc4 = (y3*y3)-(4*x3*z3);
        return cc4;
    }
}
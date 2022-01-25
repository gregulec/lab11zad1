package lab11zad1;

public class BinomialSolver {
    private final double a,b,c,x1,x2;
    
    public BinomialSolver(double a, double b, double c)throws ArithmeticException{
        this.a=a;
        this.b=b;
        this.c=c;
        double delta=b*b-4*a*c;
        if (delta<0) throw new NoRealSolution();
        this.x1=(-b-Math.sqrt(delta))/2*a;
        this.x2=(-b+Math.sqrt(delta))/2*a;        
    }
    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    public double calculate(double x){
        return a*a*x+b*x+c;
    }
}

package lab11zad1;

public class Lab11zad1 {

    public static void main(String[] args) {
        try {
            BinomialSolver b1=new BinomialSolver(1,5,3);
            BinomialSolver b2=new BinomialSolver(1,2,1);
            BinomialSolver b3=new BinomialSolver(6,3,9);
            System.out.println(b1.getX1()+" "+b1.getX2());
            System.out.println(b2.getX1()+" "+b2.getX2());
            System.out.println(b3.getX1()+" "+b3.getX2());
        } catch (NoRealSolution e) {
            System.out.println("Brak rozwiazan rzeczywistych");
        }
    
    }
    
}

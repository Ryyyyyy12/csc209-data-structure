

public class Main {
    public static void main(String[] args) {
        Fraction num1 = new Fraction(1,2);
        Fraction num2 = new Fraction(1,0);

        num2.add(num1);
        System.out.println(num2.toString());


    }
}

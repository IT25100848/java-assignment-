public class Calculator {

    
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

   
    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

    
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int combinedSum = calc.add(part1, part2);
        int expression1Result = calc.square(combinedSum);

        System.out.println("Result of (3*4 + 5*7)^2 is: " + expression1Result);

       
        int sumA = calc.add(4, 7);
        int sumB = calc.add(8, 3);
        int squareA = calc.square(sumA);
        int squareB = calc.square(sumB);
        int expression2Result = calc.add(squareA, squareB);

        System.out.println("Result of (4+7)^2 + (8+3)^2 is: " + expression2Result);
    }
}
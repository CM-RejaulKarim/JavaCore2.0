package operatorhome;

public class OperatorHome {

    public static void main(String[] args) {

        // Arithmetic operator:
        System.out.println("-------Arithmetic_operator:");
        float a = 21;
        float b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + a * b);
        System.out.println("Division: " + a / b);
        System.out.println("Modulus: " + a % b);

        a = ++a;
        b = --b;
        System.out.println("increment: " + a);
        System.out.println("decrement: " + b);

        //Assignment operator:
        System.out.println("-------Assignment_operator:");
        int z = 10;
        System.out.println("Value :" + z);
        z += 5;
        System.out.println("+=: " + z);
        z -= 5;
        System.out.println("-=: " + z);
        z *= 5;
        System.out.println("*=: " + z);
        z /= 5;
        System.out.println("/=: " + z);
        z %= 5;
        System.out.println("%=: " + z);

        // Comparison operator
        System.out.println("-------Comparison_operator:");
        int x = 10;
        int y = 15;

        System.out.println("equal: " + (x == y));
        System.out.println("not equal: " + (x != y));
        System.out.println("grater than: " + (x > y));
        System.out.println("less than: " + (x < y));
        System.out.println("grater or equal: " + (x >= y));
        System.out.println("less or equal: " + (x <= y));

        //logical operator
        System.out.println("-------logical_operator: ");

        int m = 20;
        int n = 15;
        int o = 20;
        int p = 25;
        System.out.println("logical and: "+(m<n && o<p));
        System.out.println("logical or: "+ (m<n || o<p));
        System.out.println("logical not: "+ !(m<n && o<p));
        
        
        
                
        
        
    }

}

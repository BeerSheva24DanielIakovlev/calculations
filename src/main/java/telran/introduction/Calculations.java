package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2){
        int res = op1 + op2;
        return res;

    }

    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
        return res;
    }

    public static double divide(int op1, int op2) {
        if (op2!=0) {
            double res = op1 / op2;
            return res;
        }
        else {
           //System.out.println("Ошибка, нельзя делить на ноль!"); 
           double res = op2;
            return res;
        }
            
    }

    public static int subtract(int op1, int op2) {
        int res = op1 - op2;
        return res;
    }

    public static int sumOfDigits(int op1) {
        int sum = 0;
            
         op1 = Math.abs(op1);
            
         while (op1 > 0) {
             sum += op1 % 10; 
            op1 /= 10; 
        }
            
        return sum;
    }

    public static int maxDigits(int op1) {
        int maxDigit = 0;
        
        op1 = Math.abs(op1);
        
        while (op1 > 0) {
            int currentDigit = op1 % 10; 

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            
            op1 /= 10; 
        }
        
        return maxDigit;
    }

    public static boolean isDevidedOn(int op1, int op2) {
        if (op1 % op2 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    
}

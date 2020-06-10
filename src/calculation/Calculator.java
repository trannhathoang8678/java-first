package calculation;
public class Calculator
{
    double operand1,operand2;
    String operator;
    public Calculator(double operand1,double operand2,String operator)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }
    void get()
    {
        switch  (operator)
        {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "/":
                System.out.println(operand1 / operand2);
                break;
            case "x":
                System.out.println(operand1 * operand2);
                break;
        }
    }
    public static void main(String[] args)
    {
        Calculator Cal1= new Calculator(4.0D,8.12D,"x");
        Cal1.get();
    }
}

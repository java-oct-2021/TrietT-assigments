public class Calculator implements java.io.Serializable 
{
    private double operandOne = 0;
    private double operandTwo = 0;
    private char operation;
    private double result = 0;

    public void setOperandOne( double operandOne)
    {
        this.operandOne = operandOne;
    }
    public void setOperandTwo(double operandTwo)
    {
        this.operandTwo = operandTwo;

    }
    public void setOperation(char operation)
    {
        this.operation = operation;
    }
    public void performOperation()
    {
        if(this.operation == ('+'))
        {
            this.result= this.operandOne + this.operandTwo;
        }
        if(this.operation == '-')
        {
            this.result = this.operandOne -this.operandTwo;
        }

    }
    public void getResults()
    {
        System.out.println(this.result);
    }

    
}

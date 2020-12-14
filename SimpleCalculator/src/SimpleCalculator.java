public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
       double validfirstNumber = firstNumber;
       this.firstNumber = validfirstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        double validsecondNumber = secondNumber;
        this.secondNumber = validsecondNumber;
    }
    public double getAdditionResult(){
        double adding = firstNumber + secondNumber;
        return (firstNumber + secondNumber);
    }
    public double getSubtractionResult(){
        return (firstNumber - secondNumber);
    }
    public double getMultiplicationResult(){
        return (firstNumber * secondNumber);
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else{
            return (firstNumber / secondNumber);
        }
    }
}

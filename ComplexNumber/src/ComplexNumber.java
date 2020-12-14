public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return this.real;
    }
    public double getImaginary() {
        return this.imaginary;
    }
    public void add(double real1, double imaginary1) {
        this.real += real1;
        this.imaginary += imaginary1;
    }
    public void subtract(double real2, double imaginary2) {
        this.real -= real2;
        this.imaginary -= imaginary2;
    }
    public void subtract(ComplexNumber number1) {
        this.real -= number1.real;
        this.imaginary -= number1.imaginary;
    }
    public void add(ComplexNumber number) {
        this.real += number.real;
        this.imaginary += number.imaginary;

    }
}

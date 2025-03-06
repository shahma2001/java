import java.util.Scanner;

class Complex {
    double real, imaginary;

    
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    
    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    
    Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }

    
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

public class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

       
        System.out.print("Sum of the complex numbers: ");
        sum.display();
        System.out.print("Difference of the complex numbers: ");
        difference.display();
        System.out.print("Product of the complex numbers: ");
        product.display();
    }
}


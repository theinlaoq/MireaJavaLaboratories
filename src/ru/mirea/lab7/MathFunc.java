public class MathFunc implements MathCalculable {
    ComplexNumber complexNumber;
    Circle circle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public ComplexNumber getComplexNumber() {
        return complexNumber;
    }

    public void setComplexNumber(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }
public void setComplexAndCircle(ComplexNumber complexNumber,Circle circle){
    this.complexNumber = complexNumber;
    this.circle = circle;
}
    public double lenghtCircle() {
        return pi * circle.getRadius() * circle.getRadius();
    }
    public double squareCircle() {
            return pi * circle.radius * circle.radius;
    }

    @Override
    public ComplexNumber multi(ComplexNumber a,ComplexNumber b) {
        ComplexNumber newnumber=new ComplexNumber();
        newnumber.setImaginAndReal(a.real*b.real-a.imagin*b.imagin,a.real*b.imagin+a.imagin*b.real);
        return newnumber;
    }

    @Override
    public ComplexNumber degree(ComplexNumber a,int stepen) {
        ComplexNumber b=new ComplexNumber();
        b.setImaginAndReal(1,0);
        for(int i=0;i<stepen;i++){
            b=multi(b,a);
        }
        return b;
    }

    @Override
    public double modul() {
        return Math.sqrt(complexNumber.real*complexNumber.real+complexNumber.imagin*complexNumber.imagin);
    }

    @Override
    public String toString() {
        return " ";
    }
}

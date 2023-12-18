public class ComplexNumber {
    double real, imagin;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagin() {
        return imagin;
    }

    public void setImagin(double imagin) {
        this.imagin = imagin;
    }
public void setImaginAndReal(double real,double imagin){
        this.real=real;
    this.imagin=imagin;}
    @Override
    public String toString() {
        String s="";
        if(imagin<0) {
            s=String.format("%21s%5.3f%5.3f%1s","комплексное число: ",real,imagin,"i","\n");
        }
        if(imagin==0) {
            s=String.format("%21s%5.3f%1s","комплексное число: ",real,"\n");
        }
        if(imagin>0) {
            s=String.format("%21s%5.3f%2s%5.3f%1s","комплексное число: ",real,"+",imagin,"i","\n");
        }
        return s;
    }
}
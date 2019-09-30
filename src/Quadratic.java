public class Quadratic {
    private double a,b,c;

    public Quadratic() {
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = (getB()* getB()) - (4*getA() * getC());
        return delta;

    }
    public double getRoot1(){
        double r1 = (-getB()+ Math.sqrt(getDiscriminant()))/2* getA();
        return r1;
    }
    public double getRoot2(){
        double r2 = (-getB() - Math.sqrt(getDiscriminant()))/2* getA();
        return  r2;
    }
    public double getRoot3(){
        double r3 = (-getB())/2 * getA();
        return r3;
    }

}

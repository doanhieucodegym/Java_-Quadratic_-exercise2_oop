import java.util.Scanner;

public class Main_Quadratic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập A");
        double a = sc.nextDouble();
        System.out.println("Nhập  B");

        double b =sc.nextDouble();
        System.out.println("Nhập C");
         double c = sc.nextDouble();
        Quadratic quadratic =new Quadratic(a,b,c);
       double delta = quadratic.getDiscriminant();
       double r1 =quadratic.getRoot1();
       double r2 =quadratic.getRoot2();
       double r3 =quadratic.getRoot3();
        if(delta >0){
            System.out.println("Phương trình có  2  nghiệm phân biệt  X1 =" +r1 +"\n"+"X2 ="+r2);
        }else  if(delta == 0){
            System.out.println("Phương trình có  1 nghiệm X ="+r3);
        }else{
            System.out.println("Phương trình  vô nghiệm");
        }
    }
}

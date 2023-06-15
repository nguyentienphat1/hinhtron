import java.util.Scanner;

public class Main {
    public static void dientich(int r){
        double dientich1=0;
        float pi=3.14f;
        dientich1=Math.pow(r,2)*pi;
        System.out.println("dien tích la : "+dientich1);
    }
    public static void chuvi(int r){
        double chuvi1=0;
        float pi=3.14f;
        chuvi1=(2*r)*pi;
        System.out.println("chu vi la : "+chuvi1);
    }
    public static void main(String[] args) {
        int bankinh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh");
        bankinh= scanner.nextInt();
        dientich(bankinh);
        chuvi(bankinh);
    }
}
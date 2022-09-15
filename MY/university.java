package MY;

import java.util.Date;

import java.util.Scanner;

interface Child1 {
    public void setname();

}
class vacinator {
    String name;
    String cname;
    String id;
    int Measeales;
    int BCG;
    int Rota;
    int peta;
    int tt;

    // set vaccine quaintity
    void set_vaccine(int m, int b, int r, int p, int t) {
        this.BCG = b;
        this.Measeales = m;
        this.Rota = r;
        this.peta = p;
        this.tt = t;
    }

    public void detail() {
        System.out.println("BCG" + BCG);
        System.out.println("Measeales" + Measeales);
        System.out.println("Rota" + Rota);
        System.out.println("peta" + peta);
        System.out.println("tt" + tt);
    }

    public void returnVaccine(int rb, int rm, int rr, int rp, int rt) {
        int return_BCG = BCG - rb;
        int return_MEASELES = Measeales - rm;
        int return_ROTA = Rota - rr;
        int return_PENTA = peta - rp;
        int return_TT = tt - rt;
        System.out.println("Your remaining staf vaccine is");
        System.out.println("BCG" + return_BCG);
        System.out.println("Measeales" + return_MEASELES);
        System.out.println("Rota" + return_ROTA);
        System.out.println("peta" + return_PENTA);
        System.out.println("tt" + return_TT);
    }

    vacinator(String n, String id) {
        this.name = n;
        this.id = id;
    }

    public void disply() {
        System.out.println("Name" + name);
        System.out.println("Id " + id);
    }
}

class Child {
    Date d2 = new Date();
    String name;
    int age;

    public void setChild(String name) {
        this.name = name;

    }
    // public void process(int age){
    // if(age<2){
    // System.out.println("inject BCG vaccine ");
    // System.out.println(d2);

    // }
    // else if(age>2&&age<=3){
    // System.out.println("Inject measles");
    // }
    // else if(age>3&&age<=4){
    // System.out.println("Inject penta");
    // }
    // else if(age>4&&age<=5){
    // System.out.println("Inject rota and tt both in leg");
    // }
    // }
}

public class university {

    public static void main(String[] args) {
        Child c1 = new Child();
        Scanner sc = new Scanner(System.in);
        Date d1 = new Date();

        System.out.println(d1);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter vaccinater id ");
        String id = sc.nextLine();
        vacinator v1 = new vacinator(name, id);
        System.out.println("Enter refrigernater temprature ");
        int tem = sc.nextInt();
        if (tem <= 6) {

            System.out.println("Welcome to vaccine house ");
            System.out.println("Press 1 : Check result ");
            System.out.println("press 2 : manage vaccine staff");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    // open text file
                    break;
                case 2:
                    System.out.println("Enter BCG quaintity");
                    int b = sc.nextInt();
                    System.out.println("Enter MEASELES quaintity");
                    int m = sc.nextInt();
                    System.out.println("Enter ROTA quaintity");
                    int r = sc.nextInt();
                    System.out.println("Enter PENTA quaintity");
                    int p = sc.nextInt();
                    System.out.println("Enter TT quaintity");
                    int t = sc.nextInt();
                    v1.set_vaccine(m, b, r, p, t);

                    System.out.println("do you want to continue the process");
                    String con = sc.nextLine();
                    break;
                default:
                    System.out.println("Wrong option ");

                    break;
            }
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
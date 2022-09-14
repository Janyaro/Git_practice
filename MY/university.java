package MY;
import java.io.IOException;
import java.security.spec.PKCS8EncodedKeySpec;
// import java.io.Console;
import java.util.Scanner;

class vacinator {
    String name;
    String id;
    int Measeales;
    int BCG;
    int Rota;
    int peta;
    int tt;

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
    public void returnVaccine(int rb,int rm,int rr,int rp,int rt) {
    int return_BCG = BCG-rb; 
    int return_MEASELES = Measeales-rm;
    int return_ROTA = Rota-rr;
    int return_PENTA =peta-rp;
    int return_TT = tt-rt;
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
// vaccine

public class university {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter vaccinater id ");
        String id = sc.nextLine();
        vacinator v1 = new vacinator(name, id);
        System.out.println("Enter refrigernater temprature ");
        int tem = sc.nextInt();
        if (tem <= 6) {
            menu:
            System.out.println("Welcome to vaccine house ");
           System.out.println("Press 1 : Check result ");
           System.out.println("press 2 : manage vaccine staff");
           int option = sc.nextInt();
           switch (option) {
               case 1:
                   //  open text file 
                   break;
                case 2 :
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
                
                break;
               default:
               System.out.println("Wrong option ");
               
                   break;
           }
        }
        else{
    System.out.println("Error");
        }
  sc.close();
    }
}
package MY GIY REPO;
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

public class project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter vaccinater id ");
        String id = sc.nextLine();
        vacinator v1 = new vacinator(name, id);
        System.out.println("Enter refrigernater temprature ");
        int tem = sc.nextInt();
        if (tem <= 6) {
            System.out.println("Welcome to vaccine house ");
            System.out.flush();
            System.out.println("kfdjksdj");
            // v1.set_vaccine(m, b, r, p, t);
        }
        else{
    System.out.println("Error");
        }
  sc.close();
    }
}
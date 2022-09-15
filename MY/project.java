package MY;
interface vaccine{
    public void set_vaccine();
    public void return_Vaccine();
}
interface children{
    public void set_data(String name,String address,String date_of_birth) ;
    public void check_age (int age);
}
class vacinator{
    String name;
    String id;
    int Measeales;
    int BCG;
    int Rota;
    int peta;
    int tt;
    vacinator(String n,String id){
    this.name=name;
    this.id=id;
    }

    // set vaccine detail

    void set_vaccine(int m, int b, int r, int p, int t) {
        this.BCG = b;
        this.Measeales = m;
        this.Rota = r;
        this.peta = p;
        this.tt = t;    
}
// disply vaccine

public void detail() {
    System.out.println("BCG" + BCG);
    System.out.println("Measeales" + Measeales);
    System.out.println("Rota" + Rota);
    System.out.println("peta" + peta);
    System.out.println("tt" + tt);
}

// return vaccine
 
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

    

}
public class project {
    public static void main(String[] args) {
        
    }
    
}

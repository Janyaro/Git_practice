//import java.util.Scanner;
// interface vaccine{
//     public void detail();
//     public void setvaccine(int b,int p,int r,int m,int t) ;
// }

class vacinator{
    String name;
    String id;

    vacinator(String n,String id){
    this.name=n;
    this.id=id;
    }
    public void Checkout(int temprature){
        if(temprature<6){
            
        }
        else{
            System.out.println("Vaccine are not able to use becuase temprature is less than 6 centigrade");
        }

    }
    
}
// vaccine 
class vaccine{
    int Measeales;
    int BCG;
    int Rota;
    int peta;
    int tt;
vaccine(int m,int b,int r,int p,int t){
this.BCG=b;
this.Measeales=m;
this.Rota=r;
this.peta=p;
this.tt=t;
}
public void detail(){
    System.out.println("BCG" + BCG);
    System.out.println("Measeales" + Measeales);
    System.out.println("Rota" + Rota);
    System.out.println("peta" + peta);
    System.out.println("tt" + tt);
}
}
public class project{
 
    public static void main(String[] args) {
     
 

    }
}
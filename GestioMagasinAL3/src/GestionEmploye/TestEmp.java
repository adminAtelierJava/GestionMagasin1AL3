package GestionEmploye;

import Entite.Magasin;

public class TestEmp {
    public static void main(String[] args) {
        //Employe e1=new Employe();
        Caissier c1=new Caissier(1,"test",12);

       // System.out.println(e1);
        System.out.println("test aff");

        c1.testAffi();
        System.out.println("to string ca");
        System.out.println(c1);

        c1.test() ;

        Vendeur v1=new Vendeur(1,"sana","tunis",10,1000);

        Responsable res1=new Responsable(2,"ons","ariana",20,500);


        Magasin m1=new Magasin();
        m1.ajouter(res1);
        m1.ajouter(c1);
        m1.ajouter(v1);


        m1.afficheEmp();
m1.afficheSalaire();

Employe e1=new Caissier(1,"tunis","sa",10,12);

if(e1 instanceof Caissier) {
    Caissier c3 = (Caissier) e1;
    System.out.println("num caisse :" + c3.getNumCaisse());
}else {
    System.out.println("ce n'est pas un caissier");
}
if(e1 instanceof Responsable) {
    Responsable re1 = (Responsable) e1;
    System.out.println(re1.getPrime());
}
else {

    System.out.println("ce n'est pas un responsable");
}
        System.out.println("Affiche prime");
m1.affichePrime();


    }


}

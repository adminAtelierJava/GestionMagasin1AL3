package GestionEmploye;

import Entite.Magasin;

import java.sql.SQLOutput;

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
        Responsable res2=new Responsable(2,"ons","ariana",20,500);

        Responsable res3=res2;


        Magasin m1=new Magasin();
        m1.ajouter(res1);
        m1.ajouter(c1);
        m1.ajouter(v1);


        m1.afficheEmp();
m1.afficheSalaire();

Employe e1=new Caissier(1,"tunis","sa",10,12);//upcast implicit
        Caissier c4 = (Caissier) e1; //down explicite

       // Responsable res11=(Responsable) e1;


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

m1.afficherEmpParType();
        System.out.println("test equals :"+res1.equals(res2));


        System.out.println("test equals :"+res3.equals(res2));

        System.out.println(res1.equals(c4));
String str="abc";
        System.out.println(str.equals(res2));
        System.out.println(res2.equals(str));


        Caissier c5=new Caissier(1,"tunis","nom1",10,12);
        Vendeur ve3=new Vendeur(1,"nom1","r",10,12);

        System.out.println(c5.equals(ve3));



    }


}

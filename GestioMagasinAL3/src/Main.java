import java.util.Date;

public class Main {
    public static  void main(String [] arg)
    {
        Produit p1=new Produit();
        System.out.println("identifiant:"+p1.identifiant);
        System.out.println("libelle:"+p1.libelle);
        System.out.println("marque :"+p1.marque);
        System.out.println("prix :"+p1.prix);


        Produit p2=new Produit(1024,"Lait","Delice");
        System.out.println("identifiant:"+p2.identifiant);
        System.out.println("libelle:"+p2.libelle);
        System.out.println("marque :"+p2.marque);
        System.out.println("prix :"+p2.prix);

        Produit p3=new Produit(1022,"Yaourt");
        System.out.println("identifiant:"+p3.identifiant);
        System.out.println("libelle:"+p3.libelle);


        System.out.println("afficher");
        p1.afficher();
        p2.afficher();
        p3.afficher();


        System.out.println("toString");
        System.out.println(p1.toString());
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p2);
        Date d1=new Date();
        Produit p4=new Produit(12,"Yar",d1);
        System.out.println("date :"+p4.dateexp);
        System.out.println(p4);

        Magasin m1=new Magasin();

        Magasin m2=new Magasin(1,"tunis");

        m1.ajouter(p4);
        m1.compprod++;
        m1.ajouter(p3);
        m1.ajouter(p2);
        m2.ajouter(p3);

        m1.afficher();
    }
}

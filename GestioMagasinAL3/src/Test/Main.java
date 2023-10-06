package Test;

import Entite.*;

import java.util.Date;

public class Main {
    public static  void main(String [] arg)
    {
        Produit p1=new Produit();
        System.out.println("identifiant:"+p1.getIdentifiant());
        System.out.println("libelle:"+p1.getLibelle());
        System.out.println("marque :"+p1.getMarque());
        System.out.println("prix :"+p1.getPrix());


        Produit p2=new Produit(1024,"Lait","Delice");
        System.out.println("identifiant:"+p2.getIdentifiant());
        System.out.println("libelle:"+p2.getLibelle());
        System.out.println("marque :"+p2.getMarque());
        System.out.println("prix :"+p2.getPrix());

        Produit p3=new Produit(1022,"Yaourt");
        System.out.println("identifiant:"+p3.getIdentifiant());
        System.out.println("libelle:"+p3.getLibelle());


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
        System.out.println("date :"+p4.getDateexp());
        System.out.println(p4);

        Magasin m1=new Magasin();

        Magasin m2=new Magasin(1,"tunis");

        m1.ajouter(p4);

        m1.ajouter(p3);
        m1.ajouter(p2);
        m1.ajouter(p2);
        m2.ajouter(p3);

        m1.afficher();

        m1.ajouter(p1);

        System.out.println(Magasin.getTotalProduit());
        System.out.println(p1.comparer(p2));

        System.out.println(Produit.comparer(p3,p4));
        System.out.println(m1);


        System.out.println("Affichage Magasin");
        m1.afficher();

        System.out.println("toString m2");
        System.out.println(m2);
        System.out.println("Plus Produit");
        System.out.println(m1.plusProduit(m2));

        System.out.println(Magasin.plusProduit(m1,m2));
        System.out.println(m2.supprimer(p3));
    }
}

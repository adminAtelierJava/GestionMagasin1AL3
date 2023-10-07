package Entite;

import Entite.Produit;
import GestionEmploye.Caissier;
import GestionEmploye.Employe;
import GestionEmploye.Responsable;
import GestionEmploye.Vendeur;

public class Magasin {

    int identifiant;
    private String adresse;

    private final int CAPACITE_PRD=50;

    private Produit[] tabprod=new Produit[CAPACITE_PRD];

    private int compprod;

    private static int totalProduit;
    private final int CAPACITE_EMP=20;

    private Employe [] tabemp=new Employe[CAPACITE_EMP];


    private int compE;
    public Magasin()
    {}

    public Magasin(int id,String ad)
    {
        identifiant=id;
        adresse=ad;
    }

    public void ajouter(Produit p) {
        if (chercher(p) == false) {
            if (compprod < CAPACITE_PRD) {
                tabprod[compprod] = p;
                compprod++;
                System.out.println("produit ajouté ");
                totalProduit++;
            } else {

                System.out.println("Magasin plein");
            }
        } else System.out.println("le produit existe");
    }



    public void ajouter(Employe e)
    {

        if(compE<CAPACITE_EMP)
        {
            tabemp[compE]=e;
            compE++;
        }
        else{
            System.out.println("Magasin plein");
        }
    }
    public void afficheEmp()
    {
        for (int i=0;i<compE;i++)
        {
            System.out.println(tabemp[i]);
        }
    }

    public void afficheSalaire()
    {

        for (int i=0;i<compE;i++)
        {
            System.out.println("Salaire "+tabemp[i].calculSalaire());
        }
    }

    public void affichePrime()
    {

        for (int i=0;i<compE;i++)
        {if(tabemp[i] instanceof  Responsable) {
            Responsable res = (Responsable) tabemp[i];
            System.out.println(res.getPrime());

            System.out.println(((Responsable)tabemp[i]).getPrime());
        }
        else {
            System.out.println("ce n'est pas un responsable");
        }
        }
    }
    public static int getTotalProduit()
    {
        return totalProduit;
    }
    public void afficher() {

        System.out.println("identifiant :" + this.identifiant + "adresse :" + adresse);
        for (int i = 0; i < compprod; i++) {
            System.out.println("to String produit");

            System.out.println(tabprod[i]);
        }
    }
        public boolean chercher(Produit p)
        {
            for (int i=0;i<compprod;i++)
            {

                if(p.comparer(tabprod[i]))
                    return true;
            }
            return false;
        }

        public String toString()
        {
            String str="L'ensemble des produits \n";
            for (int i=0;i<compprod;i++)
                str+=tabprod[i]+"\n";

           return "identifiant:"+identifiant
                   +"adresse :"+adresse+"\n"+str;

        }

        public Magasin plusProduit(Magasin m)
        {
            if(this.compprod>m.compprod)
                return this;
            else if(this.compprod<m.compprod)
                return m;
            else return null;
        }

        public static Magasin plusProduit(Magasin m1,Magasin m2)
        {
            if(m1.compprod>m2.compprod)
                return m1;
            else if(m1.compprod<m2.compprod)
                return m2;
            else return null;

        }

        public int searchIndice(Produit p)
        {
            for (int i=0;i<compprod;i++)
                if(Produit.comparer(tabprod[i],p))
                    return i;
            return -1;
        }
        public boolean supprimer(Produit p)
        {

            int indice=searchIndice(p);
            if(indice==-1) return false;
            else for (int i=indice;i<compprod;i++)
            {
                tabprod[i]=tabprod[i+1];


            }
            tabprod[compprod]=null;
            compprod--;
            return true;
        }

        public void afficherEmpParType()
        {
            int nbC=0,nbV=0,nbR=0;

            for (int i=0;i<compE;i++)
            {
                if(tabemp[i] instanceof Caissier)
                    nbC++;
                if(tabemp[i] instanceof Responsable)
                    nbR++;
                if(tabemp[i] instanceof Vendeur)
                    nbV++;

            }
            System.out.println("Le nombre de responsable ="+nbR);
            System.out.println("Le nombre de Vendeur ="+nbV);
            System.out.println("Le nombre de Caissier ="+nbC);
        }
    }


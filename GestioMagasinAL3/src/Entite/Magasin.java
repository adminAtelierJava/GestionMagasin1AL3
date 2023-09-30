package Entite;

import Entite.Produit;

public class Magasin {

    int identifiant;
    private String adresse;

    private final int CAPACITE_PRD=50;

    private Produit[] tabprod=new Produit[CAPACITE_PRD];

    private int compprod;

    private static int totalProduit;

    public Magasin()
    {}

    public Magasin(int id,String ad)
    {
        identifiant=id;
        adresse=ad;
    }

    public void ajouter(Produit p) {
        if (chercher(p) == true) {
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

    public static int getTotalProduit()
    {
        return totalProduit;
    }
    public void afficher() {

        System.out.println("identifiant :" + this.identifiant + "adresse :" + adresse);
        for (int i = 0; i < compprod; i++) {

            System.out.println("Marque :" + tabprod[i].getMarque());
            System.out.println("libelle :" + tabprod[i].getLibelle());
            System.out.println("date :" + tabprod[i].getDateexp());
            System.out.println("prix :" + tabprod[i].getPrix());
            System.out.println("Identifiant :" + tabprod[i].getIdentifiant());
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
    }


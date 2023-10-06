package GestionEmploye;

public abstract class Employe {
    protected int identifiant,nbh;
    protected String nom,adresse;


    public Employe(int id,String n)
    {
        this.identifiant=id;
        nom=n;
    }

    public Employe(int id,String n,String ad,int nbH)
    {
        this.identifiant=id;
        nom=n;
        adresse=ad;

        this.nbh=nbH;

    }
    public Employe()
    {
        System.out.println("je suis Employe");
    }


    public String toString()
    {
        return "id :"+identifiant+"nom :"
                +nom+"adresse :"+adresse+"nbh :"+nbh;
    }
    public void test()
    {
        System.out.println("test emplouye");
    }

    public abstract float calculSalaire();


    public boolean equals(Object o)
    {
        
    }
}

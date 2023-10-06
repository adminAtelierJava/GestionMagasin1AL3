package TestStatic;

public class Personne {
    private int id;
    private String nom,prenom;

    private static int comp;

    public static int getNbPers()
    {

        return comp;
    }
    public Personne()
    {
        comp++;
    }
    public Personne(int id,String n)
    {
        this.id=id;
        this.nom=n;
        comp++;
    }
    public Personne(int id,String n,String p)
    {
        this.id=id;
        this.nom=n;
        prenom=p;
        comp++;
    }
}

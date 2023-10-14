package GestionEmploye;

public class Responsable extends Employe{
    private int prime;


    public Responsable(int id,String n,String ad,int nbH,int prime)
    {
        super(id,n,ad,nbH);
        this.prime=prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable :"+super.toString()+"Prime :"+prime;
    }
    public float calculSalaire()
    {
        return prime+nbh*10;
    }
}

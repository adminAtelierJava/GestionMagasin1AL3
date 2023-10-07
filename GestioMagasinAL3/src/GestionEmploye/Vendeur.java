package GestionEmploye;

public class Vendeur extends Employe{
    private float tauxDeVente;

    public Vendeur(int id, String n, String ad, int nbH, float tauxDeVente) {
        super(id, n, ad, nbH);
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

   public float calculSalaire()
   {
       return tauxDeVente*100+nbh*10;
   }
}

package GestionEmploye;

public class Caissier extends Employe{
   private int numCaisse;


   public Caissier(int id,String n,int num) {
       super(id,n);
       this.numCaisse=num;
   }
   public Caissier(int id,String adree,String n,int nbh,int num)
   {
       super(id,n,adree,nbh);
       this.numCaisse=num;
   }

    public int getNumCaisse() {
        return numCaisse;
    }
    public String toString()
    {

        return "Caissier :"+super.toString()
                +"num Caisse :"+numCaisse;
    }

    public void testAffi()
    {

        System.out.println("this"+toString());
        System.out.println("super :"+super.toString());
    }

    public void test(int a)
    {
        System.out.println("a :"+a);
        super.test();
    }
    public float calculSalaire()
    {

        return nbh*100;
    }
}

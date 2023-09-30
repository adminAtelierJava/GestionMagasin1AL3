package TestStatic;

public class Test {
    public static void main(String[] args) {
        Personne p1=new Personne();
        System.out.println("Le nombre"+Personne.getNbPers());
        Personne p2=new Personne(1,"ben fa");
        System.out.println("Le nombre"+Personne.getNbPers());
        Personne p3=new Personne(2,"ben","ons");
        System.out.println("Le nombre"+Personne.getNbPers());
        System.out.println(p1.getNbPers());
    }
}

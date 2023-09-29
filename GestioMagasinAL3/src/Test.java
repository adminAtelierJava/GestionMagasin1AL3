public class Test {

    public static void main(String[] args) {
        Projet p1=new Projet("uml");
        System.out.println(p1);

        Developpeur dev1=new Developpeur("sana");
        Projet p2=new Projet("java",dev1);
        System.out.println(p2);


    }
}

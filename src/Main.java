public class Main {
    public static void main(String[] args) {
       Zahonek z = new Zahonek();
       Farmar jarda = new Farmar();

       jarda.zasadit("Jablecnik");
        System.out.println(jarda.farma);
        jarda.zavlazit();
        System.out.println(jarda.sance);
    }
}
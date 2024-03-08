public class Farmar extends Zahonek{
    private String jmeno = "Jarda";
    private int vek = 99;
    private String gender = "None";
    private String pronouns = "they/them";
    private Boolean vegan = false;
    private int height = 201;

    public void zasadit(String kytka){
        farma.add(kytka);
    }

    public void zavlazit(int zvsance){
        for (int x = 0; x < 5; x++){
            sance.r(zvsance + 10);
        }
    }
}

import java.util.ArrayList;
import java.util.Random;

public abstract class Flower {
    Random rd=new Random();

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    private int luck=rd.nextInt(51);
    ArrayList growingFlowers=new ArrayList<>();
    public void water(){
        chanceOfGrowth+=luck;
    }
    public void plant(Flower flower) throws Exception{
        try{
            if (growingFlowers.size()<5){
                growingFlowers.add(flower);
            }
        }catch(Exception e){
            new Exception("Nuhuh");
        }

    }
    public void harvest(Flower flower){
        try{
            if (growingFlowers.size()>1){
                growingFlowers.remove(growingFlowers.indexOf(flower));
            }
        }catch (Exception e){
            System.out.println();
        }
    }

    ArrayList<Farmar>zahonek=new ArrayList<>();



    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
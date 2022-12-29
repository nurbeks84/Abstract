public class Main {
    public static void main(String[] args) {

    Caw caw = new Caw(5,300,"kunagyn9","qwerty");
    Caw caw1 = new Caw(5,300,"kunagyn","qwerty");
    Sheep sheep = new Sheep(2,60,"kochkor","guliver");
    Sheep sheep1 = new Sheep(2,60,"kochkor","guliver");
    Sheep sheep2 = new Sheep(2,60,"kochkor","guliver");
    Horse horse = new Horse(6,600,"aigyr","Ahiles","jerde");
    Horse horse1 = new Horse(6,600,"aigyr","Ahiles","jerde");
    Sheep[] sheeps = {sheep,sheep1,sheep2};
    Caw[] caws = {caw1,caw};
    Horse[] horses = {horse,horse1};
    Farm farm = new Farm("California",sheeps,caws,horses);
        System.out.println(farm);

    }
}
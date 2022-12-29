public class Sheep extends Animal{


    public Sheep(int age, int weight, String gender, String nickName) {
        super(age, weight, gender, nickName);
    }

    @Override
    public String toString() {
        return super.toString()+'\n';
    }
}

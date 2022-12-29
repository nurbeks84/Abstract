public class Horse extends Animal{

    private String color;

    public Horse(int age, int weight, String gender, String nickName,String color) {
        super(age, weight, gender, nickName);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                super.toString()+'\n'+
                '}';
    }
}

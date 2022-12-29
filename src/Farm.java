import java.util.Arrays;

public class Farm {

    private String addresses;
    private Sheep[] sheep;
    private Caw[] caws;
    private Horse[] horses;

    public Farm(String addresses, Sheep[] sheep, Caw[] caws, Horse[] horses) {
        this.addresses = addresses;
        this.sheep = sheep;
        this.caws = caws;
        this.horses = horses;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Caw[] getCaws() {
        return caws;
    }

    public void setCaws(Caw[] caws) {
        this.caws = caws;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "addresses='" + addresses + '\'' +
                ", sheep=" + Arrays.toString(sheep) +
                ", caws=" + Arrays.toString(caws) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}



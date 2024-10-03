
class Reward {
    private final String name;
    private final int year;

    Reward(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return "" + name + ", " + year;
    }

}

package orgParsing;

class Person {
    
    private Reward[] rewards;
    private String[] knownFor;
    private String name;

    Person(Reward[] rewards, String[] knownFor, String name){
        this.rewards = rewards;
        this.knownFor = knownFor;
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
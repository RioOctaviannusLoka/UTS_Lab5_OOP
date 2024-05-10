package Soal1;

public class Adventurer {
    // Attribute Encapsulation
    private String name;
    private int level;
    private int power;

    // Adventurer Constructor
    public Adventurer(String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;
    }

    // Method Setter for attribute name
    public void setName(String name){
        this.name = name;
    }

    //Method Getter for attribute name
    public String getName(){
        return this.name;
    }

    // Method Setter for attribute level
    public void setLevel(int level){
        this.level = level;
    }

    // Method Getter for attribute level
    public int getLevel(){
        return this.level;
    }

    // Method Setter for attribute power
    public void setPower(int power) {
        this.power = power;
    }

    // Method Getter for attribute power
    public int getPower() {
        return this.power;
    }

    // Introduction Method
    public void Introduction(){
        if(this.level <= 10 || this.power <= 100) {
            System.out.println("Hi, My name is " + this.name +
                    ". I'm a bronze rank adventurer.\nMy current level is " + this.level +
                    " and my total power is " + this.power);
        } else if(this.level <= 20 || this.power <= 500) {
            System.out.println("Hi, My name is " + this.name +
                    ". I'm a silver rank adventurer.\nMy current level is " + this.level +
                    " and my total power is " + this.power);
        } else{
            System.out.println("Hi, My name is " + this.name +
                    ". I'm a gold rank adventurer.\nMy current level is " + this.level +
                    " and my total power is " + this.power);
        }
    }

    // Attack Method
    public void attack(){
        System.out.println(this.name + " is dealing " + this.power + " dmg");
    }

    // Method Overloading of Attack Method
    public void attack(int power) {
        if(power > this.power) {
            System.out.println(this.name + " has missed his/her attack!!!");
        } else{
            System.out.println(this.name + " has dealt " + power + " dmg");
        }
    }
}

// Inheritance
// Magician is a child class of Adventurer
class Magician extends Adventurer{
    // Magician Constructor
    public Magician(String name, int level, int power) {
        super(name, level, power);
    }

    // Method overriding of attack method
    @Override
    public void attack(){
        System.out.println(this.getName() + " has dealt " + 10 * this.getPower() + " magic dmg");
    }

    // Method Overriding of introduction method
    @Override
    public void Introduction() {
        System.out.println("Hi, My name is " + this.getName() +
                ". I'm a magician.\nMy current level is " + this.getLevel() +
                " and my total power is " + this.getPower());
    }
}
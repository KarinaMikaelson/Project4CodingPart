package org.example.codingPart.E11ZooEcosystemSimulation;

public class ZooSimulation {
    public static void main(String[] args) {

        Lion lion = new Lion("Simpa",5);
        Elephant elephant = new Elephant("Maggy",12);
        Parrot parrot = new Parrot("Oscar",2);
        Eagle eagle = new Eagle("Crocus",9);

        lion.sleep();
        lion.eat();
        lion.makeSound();
        lion.displayInformation();
        System.out.println("*******************");

        elephant.sleep();
        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();
        System.out.println("*******************");

        parrot.sleep();
        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();
        System.out.println("*******************");

        eagle.sleep();
        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();
        System.out.println("*******************");
    }
}
interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}
abstract class Animal implements AnimalBehavior{
    protected String name;
    protected int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public abstract void displayInformation();

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}
class Mammal extends Animal{
    public Mammal(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating grass");
    }
    @Override
    public void makeSound(){
        System.out.println(name+" is making a mammal sound");
    }
    public void displayInformation(){
        System.out.println("Mammal: "+name+" Age: "+age);
    }
}
class Bird extends Animal{
    public Bird(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating seeds");
    }
    @Override
    public void makeSound(){
        System.out.println(name+" is singing");
    }
    @Override
    public void displayInformation(){
        System.out.println("Bird: "+name+" Age: "+age);
    }
}
class Lion extends Mammal{
    public Lion(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" eats meat");
    }
    @Override
    public void makeSound(){
        System.out.println(name+" roars loudly");
    }
}
class Elephant extends Mammal{
    public Elephant(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" eats plants");
    }
    @Override
    public void makeSound(){
        System.out.println(name+" trumpets loudly");
    }

}
class Parrot extends Bird{
    public Parrot(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println(name+" mimics human speach");
    }
}
class Eagle extends Bird{
    public Eagle(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name+" screeches loud");
    }
}
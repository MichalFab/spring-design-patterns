package net.devdiaries.springdesignpatterns.factory;

public class Cat implements Animal {

    private String name;

    public Cat(){
        super();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "cat";
    }

    @Override
    public void makeASound() {
        System.out.println("I am a cat. Miaaaau!");
    }
}

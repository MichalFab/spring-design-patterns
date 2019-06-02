package net.devdiaries.springdesignpatterns.factory;

public class Bird implements Animal {

    private String name;

    public Bird(){
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
        return "bird";
    }

    @Override
    public void makeASound() {
        System.out.println("I am a bird. Tweet!");
    }
}

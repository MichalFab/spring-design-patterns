package net.devdiaries.springdesignpatterns.factory;

public interface Animal {
    void setName(String name);
    String getName();
    String getType();
    void makeASound();
}

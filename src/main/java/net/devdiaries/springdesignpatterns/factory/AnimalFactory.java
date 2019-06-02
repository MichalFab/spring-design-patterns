package net.devdiaries.springdesignpatterns.factory;

import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {

    public Animal createAnimal(String type) {
        switch (type) {
            case "bird":
                return new Bird();
            case "cat":
                return new Cat();
            default:
                throw new UnsupportedOperationException("Unsupported animal type!");
        }

    }
}

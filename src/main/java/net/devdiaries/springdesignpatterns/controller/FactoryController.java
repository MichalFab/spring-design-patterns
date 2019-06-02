package net.devdiaries.springdesignpatterns.controller;

import net.devdiaries.springdesignpatterns.factory.Animal;
import net.devdiaries.springdesignpatterns.factory.AnimalFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FactoryController {

    private AnimalFactory factory;

    @Autowired
    public FactoryController(AnimalFactory factory) {
        this.factory = factory;
    }

    @PostMapping("addAminal/{type}/{name}")
    public Animal addAnimal(@PathVariable String type, @PathVariable String name) {
        Animal animal = this.factory.createAnimal(type);
        animal.setName(name);
        animal.makeASound();
        return animal;
    }
}

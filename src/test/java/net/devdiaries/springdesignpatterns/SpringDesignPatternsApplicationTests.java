package net.devdiaries.springdesignpatterns;

import net.devdiaries.springdesignpatterns.prototype.SpringPrototype;
import net.devdiaries.springdesignpatterns.singleton.Singleton;
import net.devdiaries.springdesignpatterns.singleton.SpringSingleton;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDesignPatternsApplicationTests {

    @Autowired
    SpringSingleton springSingleton1;

    @Autowired
    SpringSingleton springSingleton2;

    @Autowired
    SpringPrototype prototype1;

    @Autowired
    SpringPrototype prototype2;

    @Test
    public void prototypeObjectsShouldNotBeEquals() {
        Assert.assertNotSame(prototype1, prototype2);
    }

    @Test
    public void singletonObjectsShouldBeEquals() {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

//      Checking if the Singleton objects are definitely one, the same object
        Assert.assertSame(singleton1, singleton2);

//      Checking if the spring components are definitely singletons
        Assert.assertSame(springSingleton1, springSingleton2);
    }
}

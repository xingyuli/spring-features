package org.swordess.toy.spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class DemonstrateDependencyInjection {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void demonstrateInjectPrimitives() {
        Player anonymous = (Player) applicationContext.getBean("anonymousPlayer");
        assertEquals(anonymous.getName(), "Anonymous");
        assertEquals(anonymous.getGender(), "Male");
        assertEquals(anonymous.getAge(), 18);
    }

    @Test
    public void demonstrateInjectBeansByRef() {
        Player god = (Player) applicationContext.getBean("godPlayer");
        assertEquals(god.getName(), "God");
        assertEquals(god.getGender(), "Unknown");
        assertEquals(god.getAge(), 1024);
    }

    @Test
    public void demonstrateInjectCollections() {
        Game game = (Game) applicationContext.getBean("game");
        System.out.println(game.getConfiguration());
        System.out.println(game.getDays());
        System.out.println(game.getSteps());
        System.out.println(game.getScores());
    }

}

package org.swordess.toy.spring.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Game {

    private static volatile Game instance;

    private Properties configuration;
    private List<String> days;
    private Set<Integer> steps;
    private Map<String, Integer> scores;

    private Game() {
    }

    public void setConfiguration(Properties configuration) {
        this.configuration = configuration;
    }

    public Properties getConfiguration() {
        return configuration;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public List<String> getDays() {
        return days;
    }

    public void setSteps(Set<Integer> steps) {
        this.steps = steps;
    }

    public Set<Integer> getSteps() {
        return steps;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}

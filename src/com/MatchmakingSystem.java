package com;

import java.util.List;

import static java.util.Arrays.asList;

public class MatchmakingSystem {
    private final List<Individual> individuals;

    public MatchmakingSystem(Individual individual1,Individual individual2,Individual individual3) {
        this.individuals = asList(individual1,individual2,individual3);
    }

    public void start(){
        Individual individual1=individuals.get(0);
        Individual individual2=individuals.get(1);
        Individual individual3=individuals.get(2);
        individual1.match(individual2,individual3);
    }
}

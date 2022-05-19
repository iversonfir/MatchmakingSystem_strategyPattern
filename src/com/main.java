package com;

import java.util.Arrays;
import java.util.List;

import static com.SexEnum.*;

public class main {
    public static void main(String[] args) {

        //我只寫了距離策略
        Individual individual1=new Individual(1, MALE,18,"我是阿勳",new String[]{"打籃球"},new Coord(0,0),new DistanceBasedStrategy(true));
        Individual individual2=new Individual(2, FEMALE,18,"我是小美",new String[]{"逛街"},new Coord(3,4),new DistanceBasedStrategy());
        Individual individual3=new Individual(3, FEMALE,18,"我是小雲",new String[]{"看電影"},new Coord(5,12),new DistanceBasedStrategy());
        MatchmakingSystem matchmakingSystem=new MatchmakingSystem(individual1,individual2,individual3);
        matchmakingSystem.start();
    }
}

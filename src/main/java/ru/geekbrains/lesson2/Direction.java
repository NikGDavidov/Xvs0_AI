package ru.geekbrains.lesson2;

import java.util.ArrayList;

public class Direction {
    private static ArrayList <Direction> direct ;
    private int dX;
    private int dY;

    private Direction (int dX, int dY){
        this.dX = dX;
        this.dY = dY;
    }
    private static void fillDirect(){
        direct= new ArrayList<Direction>();
        direct.add (new Direction(-1,1));
        direct.add (new Direction(0,1));
        direct.add (new Direction(1,1));
        direct.add (new Direction(1,0));

    }
    public static ArrayList<Direction> getDirect(){
        if (direct == null) fillDirect();
        return direct;
    }
    public int getdX() {
        return dX;
    }
    public int getdY(){
        return dY;
    }



}

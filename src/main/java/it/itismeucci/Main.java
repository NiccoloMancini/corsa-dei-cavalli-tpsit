package it.itismeucci;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> classifica = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        Classifica cl = new Classifica();
        List<Cavallo> cavalli = new ArrayList<>();
        for(int i = 1; i<11; i++){
            cavalli.add(new Cavallo(i));
        }
        for (Cavallo c : cavalli) {
            c.start();
        }
        for (Cavallo c : cavalli) {
            c.join();
        }
        System.out.println(classifica);
    }
}
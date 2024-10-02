package it.itismeucci;

public class Classifica {

    static synchronized void finish(int id){
        Main.classifica.add(id);
    }
}

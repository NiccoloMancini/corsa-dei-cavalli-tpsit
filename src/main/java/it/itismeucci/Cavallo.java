package it.itismeucci;

public class Cavallo extends Thread{

    private int id;

    public Cavallo(int id){
        this.id = id;
    }

    @Override
    public void run(){
        for(int i = 0; i<15; i++){
            try {
                Thread.sleep((int)Math.random() * 1600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Classifica.finish(this.id);
    }

    

    @Override
    public String toString() {
        return "Cavallo " + id;
    }

    

}

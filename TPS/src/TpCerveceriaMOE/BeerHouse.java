package TpCerveceriaMOE;

import java.util.ArrayList;

public
class BeerHouse {

    private ArrayList<Cerveza> stock ;
    boolean flag;

    public
    BeerHouse () {

        this.stock = new ArrayList<>();

    }

    public synchronized void produceCerveza(Cerveza cerveza){

        while (stock.size()== 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.stock.add(cerveza);
        System.out.println("compra ---- stock cerveza = " + stock.size());

            try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            notifyAll();

    }

    public synchronized Cerveza vendeCerveza(){

            while(stock.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Cerveza aux = null;
            aux = this.stock.remove(0);
            System.out.println("vende ---- stock cerveza = " + stock.size()+" id="+aux.getId() );

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();

        return aux;
    }

}

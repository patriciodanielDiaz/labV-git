package TpCerveceriaMOE;

public
class BeerProducter  extends Thread {

    private BeerHouse beerHouse;


    public
    BeerProducter (BeerHouse bh) {
        this.beerHouse = bh;
    }

    public void run(){

        while(true){

            Cerveza c = new Cerveza("rubia");

            this.beerHouse.produceCerveza(c);
        }

    }

}

package TpCerveceriaMOE;

public
class BeerConsumer extends Thread {

    private BeerHouse beerHouse;

    public
    BeerConsumer (BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    public void run(){

        while(true){
            this.beerHouse.vendeCerveza();
        }
    }
}

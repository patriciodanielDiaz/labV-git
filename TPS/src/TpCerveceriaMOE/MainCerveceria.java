package TpCerveceriaMOE;

public
class MainCerveceria {
    public static void main( String arg[] ){

        BeerHouse beerHouse=new BeerHouse();




        BeerConsumer beerConsumer=new BeerConsumer(beerHouse);
        BeerProducter beerProducter=new BeerProducter(beerHouse);


        beerConsumer.start();

        beerProducter.start();


    }
}

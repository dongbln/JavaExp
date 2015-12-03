import java.util.ArrayList;
import java.util.List;

/**
 * Created by TS on 03.12.15.
 */
public class StockMediator implements Mediator {

    private List<Colleague> colleaues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSaleOffers;

    private int colleagueCode = 0;

    public StockMediator() {
        colleaues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSaleOffers = new ArrayList<StockOffer>();

    }

    @Override
    public void addColleague(Colleague newColleague) {
        colleaues.add(newColleague);
        colleagueCode++;
        newColleague.setColleagueCode(colleagueCode);

    }


    @Override
    public void saleOffer(String stock, int shares, int collCode) {

        boolean stockSold = false;

        for(StockOffer offer: stockBuyOffers){
            if(offer.getStockSymbol() ==stock && offer.getStockShares() ==shares){
                System.out.println(shares +" shares of "
                        + stock + "sold to colleage code " + offer.getColleagueCode());

                stockBuyOffers.remove(offer);

                stockSold=true;
            }

            if(stockSold){
                break;
            }
        }

        if(!stockSold){
            System.out.println(shares+ " share of " +stock+
            " added to inventory");

            StockOffer newOffering = new StockOffer(shares,stock,collCode);

            stockSaleOffers.add(newOffering);
        }

    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {


        boolean stockBought = false;

        for(StockOffer offer: stockSaleOffers){
            if(offer.getStockSymbol() ==stock && offer.getStockShares() ==shares){
                System.out.println(shares +" shares of "
                        + stock + "bought to colleage code " + offer.getColleagueCode());

                stockSaleOffers.remove(offer);

                stockBought=true;
            }

            if(stockBought){
                break;
            }
        }

        if(!stockBought){
            System.out.println(shares+ " share of " +stock+
                    " added to inventory");

            StockOffer newOffering = new StockOffer(shares,stock,collCode);

            stockBuyOffers.add(newOffering);
        }


    }


    public void getStockOfferings(){
        System.out.println("\nStocks for sale");

        for(StockOffer offer: stockSaleOffers){
            System.out.println(offer.getStockShares()+ " of " +
            offer.getStockSymbol());
        }



        System.out.println("\nStocks for buy");

        for(StockOffer offer: stockBuyOffers){
            System.out.println(offer.getStockShares()+ " of " +
                    offer.getStockSymbol());
        }
    }


}
/**
 * Created by TS on 03.12.15.
 */
public interface Mediator {

//    public void saleOffer(String stock, int shares);
//    public void buyOffer(String stock, int shares);
    public void saleOffer(String stock, int shares, int collCode);
    public void buyOffer(String stock, int shares,  int collCode);
    public void addColleague(Colleague colleague);
}

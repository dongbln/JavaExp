/**
 * Created by TS on 03.12.15.
 */
public class Animal {
    private String name;


    public Flys flyingFype;

    public String tryToFly(){
        return flyingFype.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingFype = newFlyType;
    }
}

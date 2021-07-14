package pl.pwilkosz.designpatterns.strategy;

public abstract class Heroe {
    private IFightingStrategy fightingStrategy;

    public Heroe(){

    }

    public Heroe(IFightingStrategy fightingBy){
        this.fightingStrategy = fightingBy;
    }

    public void changeFightingStrategy(IFightingStrategy fightingBy){
        this.fightingStrategy = fightingBy;
    }

    public String startFighting(){
        if(fightingStrategy != null){
            return fightingStrategy.fight();
        }else{
            return null;
        }
    }
}

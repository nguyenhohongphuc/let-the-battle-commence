

public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        int ground = Battle.GROUND;
        if(Utility.isSquare(ground)){
            if(getBaseHp()*2 > 999){
                return 999;
            } 
            else return getBaseHp()*2;
        }
        else{
            if(getWp() == 1) return getBaseHp();
            else return getBaseHp()/10.0;
        }
    }
}

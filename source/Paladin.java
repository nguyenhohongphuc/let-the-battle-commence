
public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		if(Utility.isFib(getBaseHp())){
			return 1000 + Utility.Fibth(getBaseHp());
		}
		else return getBaseHp()*3;
	}
}

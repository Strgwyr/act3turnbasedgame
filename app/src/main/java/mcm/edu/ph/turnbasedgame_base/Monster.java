package mcm.edu.ph.turnbasedgame_base;

public class Monster extends GameUnit {
    int exp;
    double statSTR;
    double statAGI;
    double statINT;

    public Monster() {
    }

    public Monster(String unitName, int baseHealth, int baseMana, int minDPT, int maxDPT, double statSTR, double statAGI, double statINT) {

        //super.unitName = unitName;
        setUnitName(unitName);
        //super.basehealth = baseHealth;
        setBasehealth(baseHealth);
        //super.baseMana = baseMana;
        setBaseMana(baseMana);
        //super.minDPT = minDPT;
        setMinDPT(minDPT);
        //super.maxDPT = maxDPT;
        setMaxDPT(maxDPT);
        this.statSTR = statSTR;
        this.statAGI = statAGI;
        this.statINT = statINT;
        //super.level = 1;
        setLevel(1);
        //super.baseArmor = 0;
        setBaseArmor(0);
        this.exp = 0;

    }
}

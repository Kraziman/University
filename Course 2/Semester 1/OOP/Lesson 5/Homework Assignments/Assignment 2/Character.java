public abstract class Character {
    protected String name;
    protected double life;

    protected Character(String name, double life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public double getLife() {
        return life;
    }

    public abstract double strike();

    public abstract void defend(double damage);
}

class Defender extends Character{
    private double defensiveSkill;
    private double armor;
    private double healingSkill;

    public Defender(String name, double life, double defensiveSkill, double armor, double healingSkill) {
        super(name, 250);
        this.defensiveSkill = defensiveSkill;
        this.armor = armor;
        this.healingSkill = healingSkill;
    }

    public double getDefensiveSkill() {
        return defensiveSkill;
    }

    public double getArmor() {
        return armor;
    }

    public double getHealingSkill() {
        return healingSkill;
    }

    @Override
    public double strike() {
        return 10;
    }

    @Override
    public void defend(double damage) {
        double maxLife = life;
        if (armor > 0){
            armor -= damage;
            if (armor < 0){
                life += armor;
                armor = 0;
            }
        }
        else{
            life -= damage;
        }

        double healingAmount = life * (healingSkill * 0.01);
        if ((life += healingAmount) <= maxLife){
            life += healingAmount;
        }
        else{
            life = maxLife;
        }

        if (life < 0){
            life = 0;
        }
    }
}

class Attacker extends Character{
    protected double efficiency;

    public Attacker(String name, double life, double efficiency) {
        super(name, 150);
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    @Override
    public double strike() {
        return efficiency;
    }

    @Override
    public void defend(double damage) {
        life -= damage;
        if (life < 0){
            life = 0;
        }
    }
}
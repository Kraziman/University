public class Character {
    private String name;
    private double life;

    public Character() {
    }

    public Character(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Defender extends Character{
    private String defensiveSkill;
    private String armor;
    private String healingSkill;

    public Defender(String defensiveSkill, String armor, String healingSkill) {
        this.defensiveSkill = defensiveSkill;
        this.armor = armor;
        this.healingSkill = healingSkill;
    }

    public Defender(String name, int life, String defensiveSkill, String armor, String healingSkill) {
        super(name, 250);
        this.defensiveSkill = defensiveSkill;
        this.armor = armor;
        this.healingSkill = healingSkill;
    }

    public String getDefensiveSkill() {
        return defensiveSkill;
    }

    public void setDefensiveSkill(String defensiveSkill) {
        this.defensiveSkill = defensiveSkill;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getHealingSkill() {
        return healingSkill;
    }

    public void setHealingSkill(String healingSkill) {
        this.healingSkill = healingSkill;
    }
}

class Attacker extends Character{
    private String efficiency;

    public Attacker(String name,int life, String efficiency) {
        super(name, 150);
        this.efficiency = efficiency;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}

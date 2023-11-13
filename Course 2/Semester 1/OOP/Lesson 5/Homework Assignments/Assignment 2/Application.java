public class Application {
    public static void main(String[] args) {
        // Test Defender
        Defender defender = new Defender("Defender1", 250, 100, 150, 50);
        System.out.println("Defender Initial Life: " + defender.getLife());
        System.out.println("Defender Initial Defensive Skill: " + defender.getDefensiveSkill());
        System.out.println("Defender Initial Armor: " + defender.getArmor());

        double defenderStrike = defender.strike();
        System.out.println("Defender Strike Value: " + defenderStrike);

        // Assume some damage is dealt to the defender
        double damageToDefender = 20;
        defender.defend(damageToDefender);
        System.out.println("Defender Life after Damage: " + defender.getLife());
        System.out.println("Defender Armor after Damage: " + defender.getArmor());

        // Test Attacker
        Attacker attacker = new Attacker("Attacker1", 150, 20);
        System.out.println("\nAttacker Initial Life: " + attacker.getLife());
        System.out.println("Attacker Initial Efficiency: " + attacker.getEfficiency());

        double attackerStrike = attacker.strike();
        System.out.println("Attacker Strike Value: " + attackerStrike);

        // Assume some damage is dealt to the attacker
        double damageToAttacker = 15;
        attacker.defend(damageToAttacker);
        System.out.println("Attacker Life after Damage: " + attacker.getLife());
    }
}

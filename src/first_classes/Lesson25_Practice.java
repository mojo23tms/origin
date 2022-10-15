package first_classes;

public class Lesson25_Practice {

    public static void main(String[] args) {
        short moveSpd, sightRangeMin, sightRangeMax;
        float armor, baseAttackTime, attackPoint;
        byte dmgMin, dmgMax;

        moveSpd = 315;
        sightRangeMin = 800;
        sightRangeMax = 1800;
        armor = 3.68f;
        baseAttackTime = 1.7f;
        dmgMin = 49;
        dmgMax = 59;
        attackPoint = 0.467f;

        System.out.println("Presenting EARTHSHAKER!");
        System.out.println("Basic stats:");
        System.out.println("- Movement speed: " + moveSpd);
        System.out.println("- Sight range: " + sightRangeMax + "/" + sightRangeMin);
        System.out.println("- Armor: " + armor);
        System.out.println("- Base attack time: " + baseAttackTime);
        System.out.println("- Damage: " + dmgMin + " - " + dmgMax);
        System.out.println("- Attack point: " + attackPoint);
    }
}

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setTypeOfWeapon(WeaponType.MACHINEGUN);
        weapon.setNameOfWeapon("BC-54");
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(300);

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss weapon type: " + weapon.getTypeOfWeapon());
        System.out.println("Boss weapon name: " + weapon.getNameOfWeapon());



    }
}
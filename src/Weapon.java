public class Weapon {
    private WeaponType typeOfWeapon;
    private String nameOfWeapon;

    public WeaponType getTypeOfWeapon(){
        return typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setTypeOfWeapon (WeaponType typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public void setNameOfWeapon (String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}

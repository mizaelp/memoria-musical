package enums;

public enum Notes {
    C("Dó"),
    D("Ré"),
    E("Mi"),
    F("Fá"),
    G("Sol"),
    A("Lá"),
    B("Si");

    private String nameString;

    Notes(String nameString) {
        this.nameString = nameString;
    }

    public String getNameString() {
        return nameString;
    }
   
}
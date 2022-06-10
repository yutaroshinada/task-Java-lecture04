package task03;

public enum Menus {
    POP_CORN("Sサイズ:¥350,Mサイズ:¥400,Lサイズ:¥450"),
    CHICKEN_NUGET("¥380"),
    CRAPE("¥450"),
    ;

    private final String name;

    Menus(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.name;
    }
}

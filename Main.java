public class Main {
    public static void main(String[] args) {
        Hero knight = new Knight(new Sword());
        knight.attack();

        Hero magicKnight = new Knight(new MagicWand());
        magicKnight.attack();
    }
}

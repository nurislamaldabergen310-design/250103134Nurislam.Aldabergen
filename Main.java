public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("salary_sheet.png", "GUEST");
        Image img2 = new ProxyImage("salary_sheet.png", "ADMIN");

        img1.show();
        img2.show();
    }
}

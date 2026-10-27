public class Main {
    public static void main(String[] args) {
        Internet schoolNet = new SchoolProxyInternet();

        schoolNet.connectTo("wikipedia.org");
        schoolNet.connectTo("gaming.com");
    }
}

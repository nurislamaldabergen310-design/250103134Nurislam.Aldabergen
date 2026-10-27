public class Main {
    public static void main(String[] args) {
        Video video = new ProxyVideo("Cat_Memes.mp4");

        for (int i = 0; i < 3; i++) {
            video.play();
            if (i < 2) {
                System.out.println();
            }
        }
    }
}

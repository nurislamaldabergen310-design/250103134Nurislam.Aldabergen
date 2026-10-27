public class RealVideo implements Video {

    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        System.out.println("[DOWNLOADING] Connecting to server & buffering 4K video: " + fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + fileName);
    }
}

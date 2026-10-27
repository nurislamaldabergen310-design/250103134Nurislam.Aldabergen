public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        PartyRemote partyRemote = new PartyRemote(radio);

        partyRemote.partyMode();
    }
}

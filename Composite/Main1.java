public class Main1 {
    public static void main(String[] args) {
        AudioSystem audioSystem = new AudioSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();
        GameConsole gameConsole = new GameConsole();
        TV tv = new TV();
        HomeTheaterFacade facade = new HomeTheaterFacade(audioSystem, dvdPlayer, gameConsole, tv);
        facade.SetUpGameingConsole("geometry dash");
        System.out.println(" ");
        facade.SetUpHomeCimena();
        System.out.println(" ");
        facade.offGameConsole();
    }
}

public class HomeTheaterFacade {
    AudioSystem audioSystem;
    DVDPlayer dvdPlayer;
    GameConsole gameConsole;
    TV tv;
    public HomeTheaterFacade(AudioSystem audioSystem, DVDPlayer dvdPlayer, GameConsole gameConsole, TV tv){
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.gameConsole = gameConsole;
        this.tv = tv;
    }
    void SetUpHomeCimena(){
        audioSystem.powerOn();
        audioSystem.setLastVolume();
        dvdPlayer.powerOn();
        dvdPlayer.configAudioSettings();
        tv.powerOn();
        tv.menu();
        tv.HdmiMode();
        dvdPlayer.menu();
        dvdPlayer.play();
    }void offHomeCimena(){
        audioSystem.powerOff();
        dvdPlayer.powerOff();
        tv.powerOff();
    }void SetUpGameingConsole(String game){
        audioSystem.powerOn();
        audioSystem.setLastVolume();
        gameConsole.powerOn();
        gameConsole.configAudioSettings();
        tv.powerOn();
        tv.menu();
        tv.HdmiMode();
        gameConsole.SetConfigurationForGame(game, "SteamLibrary//steamapps//common//" + game + "//" + game + "//config");
        gameConsole.runGame(game);
        gameConsole.loadSaveFile("SteamLibrary//steamapps//common//" + game + "//save");
    }
    void offGameConsole(){
        audioSystem.powerOff();
        gameConsole.powerOff();
        tv.powerOff();
    }
}

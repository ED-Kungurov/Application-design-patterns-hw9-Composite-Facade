public class GameConsole {
    void powerOn(){
        System.out.println("GameConsole powered on ");
    }
    void powerOff(){
        System.out.println("GameConsole powered off ");
    }
    void menu(){
        System.out.println("going to menu ");
    }
    void configAudioSettings(){
        System.out.println("audio settings configured ");
    }
    void SetConfigurationForGame(String game, String filePath){
        System.out.println("Set configuration for game " + game + " file " + filePath);
    }
    void runGame(String game){
        System.out.println("Running game " + game);
    }
    void loadSaveFile(String filePath){
        System.out.println("Load save file " + filePath);
    }
}

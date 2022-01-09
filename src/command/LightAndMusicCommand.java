package command;

public class LightAndMusicCommand implements Command {
    MusicPlayer musicPlayer;
    Light light;

    public LightAndMusicCommand(MusicPlayer musicPlayer, Light light) {
        this.musicPlayer = musicPlayer;
        this.light = light;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
        light.switchLight();
    }
}
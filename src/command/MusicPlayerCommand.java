package command;

public class MusicPlayerCommand implements Command {
    MusicPlayer musicPlayer;

    public MusicPlayerCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}
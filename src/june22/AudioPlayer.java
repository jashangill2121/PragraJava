package june22;

public class AudioPlayer extends  MediaDevice{

    String songName;
    String artist;

    public AudioPlayer(String name) {
        super(name);
    }

    public void play(){
        System.out.println(songName + " is playing");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("This audio player has play,pause,record features");
    }
}

package june22;

public class VideoPlayer extends MediaDevice{

    String videoTitle;
    double duration;

    public VideoPlayer(String name) {
        super(name);
    }

    public void play(){

        System.out.println(videoTitle + " is playing");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("This video player can display 4k videos");
    }
}

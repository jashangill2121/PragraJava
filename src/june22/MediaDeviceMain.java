package june22;

public class MediaDeviceMain {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer("MVP");
        audioPlayer.play();

        VideoPlayer videoPlayer = new VideoPlayer("Kamayi");
        videoPlayer.displayDetails();

        ImageDisplay imageDisplay = new ImageDisplay("Sidhu");
        imageDisplay.displayDetails();
    }
}

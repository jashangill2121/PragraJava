package june22;

public abstract class MediaDevice {
    private String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    public void displayDetails(){

        System.out.println("This device has audio,video features and displays images");

    }
}

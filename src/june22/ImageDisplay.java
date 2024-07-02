package june22;

public class ImageDisplay extends MediaDevice{

    String imageName;
    String resolution;

    public ImageDisplay(String name) {
        super(name);
    }

    public void displayImage(){

        System.out.println(imageName + "is displaying");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("This device can store upto 1GB of images");

    }
}

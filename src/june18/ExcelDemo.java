package june18;

public class ExcelDemo {

   public String read;
   private String write;

    public ExcelDemo(String read, String write) {
        this.read = read;
        this.write = write;
    }

    public String getPermission(){

        return read;
    }

    public void setPermission(){

        this.write = write;
    }
}

package handy;

public class PhoneFile {
    private String extention;
    private int size;
    private String name;

    public PhoneFile(String extention, int size, String name){
        this.extention = extention;
        this.size = size;
        this.name = name;
    }

    public String getExtention() {
        return extention;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return this.extention + ":" + this.name + ":" + this.size;
    }
}

package in.surjitsingh.recyclerviewandroid.d;

public class Data {
    int imgID;
    String title, desc;

    public Data(int imgID, String title, String desc) {
        this.imgID = imgID;
        this.title = title;
        this.desc = desc;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

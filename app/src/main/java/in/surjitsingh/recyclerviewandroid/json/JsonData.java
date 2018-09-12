package in.surjitsingh.recyclerviewandroid.json;

public class JsonData {

    int imgID;
    String name, mob, about;

    public JsonData(int imgID, String name, String mob, String about) {
        this.imgID = imgID;
        this.name = name;
        this.mob = mob;
        this.about = about;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}

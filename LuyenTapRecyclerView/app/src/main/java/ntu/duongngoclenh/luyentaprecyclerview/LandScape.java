package ntu.duongngoclenh.luyentaprecyclerview;

public class LandScape {
    String image;
    String cation;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCation() {
        return cation;
    }

    public void setCation(String cation) {
        this.cation = cation;
    }

    public LandScape(String image, String cation) {
        this.image = image;
        this.cation = cation;
    }
}
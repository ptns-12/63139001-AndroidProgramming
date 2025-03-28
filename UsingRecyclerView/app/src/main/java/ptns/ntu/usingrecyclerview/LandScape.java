package ptns.ntu.usingrecyclerview;

public class LandScape {
    String landImageFileName;
    String landCation;

    public LandScape(String landImageFileName, String landCation) {
        this.landImageFileName = landImageFileName;
        this.landCation = landCation;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return landCation;
    }

    public void setLandCaption(String landCation) {
        this.landCation = landCation;
    }
}

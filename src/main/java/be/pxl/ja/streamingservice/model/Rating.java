package be.pxl.ja.streamingservice.model;

public enum Rating {

    LITTLE_KIDS(),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    private int minAge;

    Rating(int minAge) {
        this.minAge = minAge;
    }

    Rating() {
    }

    public int getMinAge(){
        return minAge;
    }
}

package models_my;

public class PetResponse_my {
    private long id;
    private Category_my category;
    private String name;
    private String[] photoUrls;
    private Tag[] tags;
    private String status;

    public long getId() {
        return id;
    }

    public Category_my getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }
}

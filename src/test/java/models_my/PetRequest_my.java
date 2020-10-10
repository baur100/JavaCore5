package models_my;

public class PetRequest_my {
    private long id;
    private Category_my category;
    private String name;
    private String[] photoUrls;

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

    private Tag[] tags;
    private String status;

    public PetRequest_my(Category_my category, String name, String[] photoUrls, Tag[] tags, String status) {
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
}

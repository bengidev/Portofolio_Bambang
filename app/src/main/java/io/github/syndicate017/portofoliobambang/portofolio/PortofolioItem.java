package io.github.syndicate017.portofoliobambang.portofolio;

import java.io.Serializable;

public class PortofolioItem implements Serializable {

    private int image;
    private String title, description;

    public PortofolioItem() {
    }

    public PortofolioItem(int image) {
        this.image = image;
    }

    public PortofolioItem(int image, String description) {
        this.image = image;
        this.description = description;
    }

    public PortofolioItem(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

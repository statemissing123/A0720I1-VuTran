package model;

public class ProductManga {
    private int id;
    private String nameManga;
    private String author;
    private String nation;
    private String episodes;

    public ProductManga() {
    }

    public ProductManga(int id, String nameManga, String author, String nation, String episodes) {
        this.id = id;
        this.nameManga = nameManga;
        this.author = author;
        this.nation = nation;
        this.episodes = episodes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameManga() {
        return nameManga;
    }

    public void setNameManga(String nameManga) {
        this.nameManga = nameManga;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }
}

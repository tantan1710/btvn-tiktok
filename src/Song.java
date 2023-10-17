public class Song extends Tiktok {
    private int id;
    private String name;
    private String singer;

    public Song(int id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}

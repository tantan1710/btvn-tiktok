public class Idol extends Tiktok {
    private String name;
    private int id;
    private String email;
    private int follower;
    private String group;

    public Idol(String name, int id, String email, int follower, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.follower = follower;
        this.group = group;
    }

    public Idol() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

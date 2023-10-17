public class Follower extends Idol {
    private String name;
    private int id;
    private String email;
    private int numberOfLike;

    public Follower(String name, int id, String email, int follower, String group, String name1, int id1, String email1, int numberOfLike) {
        super(name, id, email, follower, group);
        this.name = name1;
        this.id = id1;
        this.email = email1;
        this.numberOfLike = numberOfLike;
    }

    public Follower(String name1, int id1, String email1, int numberOfFollower) {
        super();
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

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }
}

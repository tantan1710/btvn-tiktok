import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols = new ArrayList<>();
    private ArrayList<Song> songs = new ArrayList<>();

    public void addIdol(String name, int id, String email, ArrayList<Follower> followers, String group) {
    }
    public void addSong(int id, String name, String singer) {
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }


}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tiktok tiktok = new Tiktok();
        System.out.println("Nhập số lượng idol tiktok");
        int numberIdol = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberIdol; i++) {
            System.out.println("Nhập tên idol: "+i);
            String name = scanner.nextLine();
            System.out.println("Nhập id idol: " + i);
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email idol: " + i);
            String email = scanner.nextLine();
            System.out.println("Nhập group idol: " + i);
            String group = scanner.nextLine();
            System.out.println("Nhập số followers của idol: "+i);
            int numberOfFollower = Integer.parseInt(scanner.nextLine());
            ArrayList<Follower> followers = new ArrayList<>();
            for(int j = 1; j <= numberOfFollower; j++) {
                System.out.println("Nhập tên follower: " + j);
                String name1 = scanner.nextLine();
                System.out.println("Nhập id follower: " + j);
                int id1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email follower: " + j);
                String email1 = scanner.nextLine();
                System.out.println("Nhập số lượt like follower: " + j);
                int NumberOfFollower = Integer.parseInt(scanner.nextLine());
                followers.add(new Follower(name1, id1 , email1 , NumberOfFollower));
            }
            tiktok.addIdol(name, id, email, followers, group);
        }
        System.out.println("Nhập số lượng bài hát trên tiktok: ");
        int numberSongs = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberSongs; i++){
            System.out.println("Nhập id bài hát: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên bài hát: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tên ca sĩ: ");
            String singer = scanner.nextLine();
            tiktok.addSong(id, name, singer);
        }
        System.out.println(tiktok);
    }
}

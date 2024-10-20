package playlistlagu;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
        } else {

            Song temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong.");
        } else {
            Song temp = head;
            while (temp != null) {
                System.out.println(temp.title);
                temp = temp.next;
            }
        }
    }
}

public class PlaylistLagu {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong("Rindu Muhammadku");
        myPlaylist.addSong("Treat You Better");
        myPlaylist.addSong("Penjaga Hati");

        System.out.println("Daftar lagu dalam playlist:");
        myPlaylist.displayPlaylist();
    }
}
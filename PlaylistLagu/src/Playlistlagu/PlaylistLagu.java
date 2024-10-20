package Playlistlagu;

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

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong.");
            return;
        }

        Song current = head;
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }
  }

public class PlaylistLagu {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        myPlaylist.addSong("Rindu Muhammadku");
        myPlaylist.addSong("Penjaga Hati");
        myPlaylist.addSong("Treat You Better");

        myPlaylist.displayPlaylist();
    }
}

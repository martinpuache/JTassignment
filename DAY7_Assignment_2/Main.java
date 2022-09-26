package Task_2;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueDemo songQueue = new QueueDemo(5);

        songQueue.enqueue(new Song("Cowboy in LA", "Lany"));
        songQueue.enqueue(new Song("Sunflower", "Post Malone"));
        songQueue.enqueue(new Song("7UP", "Boy in space"));
        songQueue.enqueue(new Song("dancing in the kitchen", "Lany"));
        songQueue.enqueue(new Song("Psycho", "Post Malone"));

        System.out.println("\n");

        songQueue.nextSong();
        songQueue.playSong();
        songQueue.nextSong();
        songQueue.songsLeft();
        songQueue.playSong();
        songQueue.songsLeft();
        songQueue.playSong();
        songQueue.playSong();
        songQueue.playSong();
        songQueue.songsLeft();
        songQueue.playSong();

    }
}

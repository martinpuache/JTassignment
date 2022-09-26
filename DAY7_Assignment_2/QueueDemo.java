package Task_2;

public class QueueDemo {
    public int front, rear, capacity, count;
    public Song queue[];

    public QueueDemo(int size)
    {
        queue = new Song[size];
        this.capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public void enqueue(Song song)
    {
        if(count == capacity)
        {
            System.out.println("Playlist is full!");
        }
        else
        {
            System.out.println("Song: " + song.getName() + " by " + song.getArtist() + " has been added");
            rear = (rear+1)%capacity;
            queue[rear] = song;
            count++;

        }
        
    }

    public void playSong()
    {
        if(count == 0)
        {
            System.out.println("There is no song to play!");
            
        }
        else
        {
            Song x = queue[front];
            System.out.println("Playing: "+ x.getName() + " by " + x.getArtist());
            front = (front+1)%capacity;
            count--;
        }
        
    }

    public String nextSong()
    {
        System.out.println("Next song: " + queue[front].getName());
        return queue[front].getName();
    }

    public int songsLeft()
    {
        System.out.println("Number of songs left: " + count);
        return count;
    }
}

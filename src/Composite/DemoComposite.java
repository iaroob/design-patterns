package Composite;

public class DemoComposite {
    public static void main(String[] args) {

        // Make "Sabina' hits" playlist and add 2 songs to it
        PlayList sabinaPlayList = new PlayList("Sabina's Hit");
        sabinaPlayList.add(new Song("Princesa", "Joanquin Sabina"));
        sabinaPlayList.add(new Song("Calle Melancolia", "Joanquin Sabina"));

        // Make "Manolo García's hits" playlist and add 3 songs to it
        PlayList garciaPlayList = new PlayList("Manolo Garcia's Hit");
        garciaPlayList.add(new Song("Pájaros de barro", "Manolo García"));
        garciaPlayList.add(new Song("Zapatero", "Manolo García"));
        garciaPlayList.add(new Song("A San Fernando, un ratito a pie y otro caminando", "Manolo García"));

        // Make "my songs" playlist and add teh two playlists and one single song
        PlayList mySongs = new PlayList("My songs");
        mySongs.add(sabinaPlayList);
        mySongs.add(garciaPlayList);
        mySongs.add(new Song("Penso positivo", "Lorenzo Jovanotti"));

        // Play all songs of each playlist
        mySongs.play();
    }
}

//"Princesa", "Joanquin Sabina"

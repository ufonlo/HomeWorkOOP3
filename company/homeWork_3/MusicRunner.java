package com.company.homeWork_3;

public class MusicRunner {

    public static void main(String[] args) {


        User user = new User("Henadii");

        //any content for songs
        byte contentOne[] = {1, 0, 1};
        byte contentTwo[] = {1, 1, 1};
        byte contentThree[] = {0, 0, 1};
        byte contentFour[] = {0, 1, 1};
        byte contentFive[] = {1, 1, 0};
        byte contentSix[] = {0, 0, 0};
        //check User's methods
        user.createPlaylist("PlaylistOne");
        user.addSongToPlaylist("PlaylistOne",
                new Song("Astronomy", "Metallica", "rok",
                        803, new AudioContent(contentOne)));
        user.addSongToPlaylist("PlaylistOne",
                new Song("No Woman no Cry", "Bob Marley", "Reggy",
                        704, new AudioContent(contentTwo)));
        user.addSongToPlaylist("PlaylistOne",
                new Song("One love", "Bob Marley", "Reggy",
                        417, new AudioContent(contentThree)));

        user.createPlaylist("PlaylistTwo");
        user.addSongToPlaylist("PlaylistTwo",
                new Song("Human", "Rag'n'Bone Man", "Pop", 317,
                        new AudioContent(contentFour)));
        user.addSongToPlaylist("PlaylistTwo",
                new Song("Not Afraid", "Eminem", "hip-hop", 418,
                        new AudioContent(contentFive)));
        user.addSongToPlaylist("PlaylistTwo",
                new Song("Lose Yourself?", "Eminem", "Pop", 523,
                        new AudioContent(contentSix)));
        user.addSongToPlaylist("PlaylistTwo",
                new Song("My Way", "Calvin Harris", "Pop", 404,
                        new AudioContent(contentThree)));

        System.out.println("User name is: " + user.getName());
        System.out.println(user.findByTitle("PlaylistOne"));
        System.out.println(user);
        //check Playlist's methods
        System.out.println(user.findByTitle("PlaylistOne").getTotalLength());
        System.out.println(user.findByTitle("PlaylistTwo").findByAuthor("Eminem"));
        System.out.println(user.findByTitle("PlaylistTwo").findByTitlePart("Not" +
                " Afraid"));

        Song newSong = new Song("What's My Name?", "Rihanna", "Pop",
                423, new AudioContent(contentFive));

        user.findByTitle("PlaylistOne").addSong(newSong);
        System.out.println(user.findByTitle("PlaylistOne"));
        //check Song's methods
        System.out.println(newSong.getAuthor());
        System.out.println(newSong.getTitle());
        System.out.println(newSong.getLength());
        System.out.println(newSong.getContent());
    }
}
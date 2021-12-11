package com.george.spotifydb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileStream {
    public static void stream() {
        try {
            List<String>  songList = Files
                    .lines(Path.of("spotify_dataset.csv"))
                    .map(s -> s.split(",")[2])
                    .toList();
            System.out.println(songList.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

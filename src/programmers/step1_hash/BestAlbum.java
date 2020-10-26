package programmers.step1_hash;

import java.util.*;

public class BestAlbum {
    private static final int ZERO = 0;

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, List<Song>> album = new HashMap<>();
        int songCounts = genres.length;
        for (int i = ZERO; i < songCounts; i++) {
            String genre = genres[i];
            Song song = new Song(i, plays[i]);
            List<Song> songs = album.getOrDefault(genre, new ArrayList<>());
            songs.add(song);
            album.put(genre, songs);
        }
        List<String> distinctGenres = new ArrayList<>(album.keySet());
        Collections.sort(distinctGenres, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int o1PlaySum = album.get(o1)
                        .stream()
                        .mapToInt(song -> song.playCounts)
                        .sum();
                int o2PlaySum = album.get(o2)
                        .stream()
                        .mapToInt(song -> song.playCounts)
                        .sum();
                if (o1PlaySum > o2PlaySum) {
                    return -1;
                } else if (o1PlaySum < o2PlaySum) {
                    return 1;
                }
                return o1.equals(o2) ? 0 : -1;
            }
        });
        List<Integer> answer = new ArrayList<>();
        for (String genre : distinctGenres) {
            List<Song> songs = album.get(genre);
            Collections.sort(songs, new Comparator<Song>() {
                @Override
                public int compare(Song o1, Song o2) {
                    if (o1.playCounts > o2.playCounts) {
                        return -1;
                    } else if (o1.playCounts < o2.playCounts) {
                        return 1;
                    }
                    if (o1.index < o2.index) {
                        return -1;
                    } else if (o1.index > o2.index) {
                        return 1;
                    }
                    return 0;
                }
            });
            int count = ZERO;
            for (Song song : songs) {
                answer.add(song.index);
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        return answer.stream()
                .mapToInt(index -> index)
                .toArray();
    }

    public static void main(String[] args) {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(solution(genres, plays)));
    }

    static class Song {

        private final int index;
        private final int playCounts;

        public Song(int index, int playCounts) {
            this.index = index;
            this.playCounts = playCounts;
        }
    }
}

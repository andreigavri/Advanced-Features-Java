package com.sda.ConcurrentProgramming.FunctionalProgramming;

import com.sda.Practice.Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Video video = new Video("GOT1", "got1.com",
                VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com",
                VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com",
                VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com",
                VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com",
                VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com",
                VideoType.EPISODE);
        Episode episode = new Episode("got1", 1,
                Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2,
                Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1,
                Arrays.asList(video4, video5));
        Season season = new Season("GOTS1", 1,
                Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS2", 2,
                Arrays.asList(episode2));
        List<Season> seasons = Arrays.asList(season, season1);

        List<Episode> episodes = seasons.stream().flatMap(season2 -> season2.episodes.stream()).collect(Collectors.toList());
        System.out.println(episodes);

        List<Video> videos = seasons.stream().flatMap(season2 -> season2.episodes.stream()).flatMap((e) -> e.videos.stream()).collect(Collectors.toList());
        System.out.println(videos);

        List<String> seasonNames = seasons.stream().map((s)-> s.seasonName).collect(Collectors.toList());
        System.out.println(seasonNames);

        List<Integer> seasonNumbers = seasons.stream().map((s)->s.seasonNumber).collect(Collectors.toList());
        System.out.println(seasonNumbers);

        List<String> episodeNames =  seasons.stream().flatMap(season2 -> season2.episodes.stream()).map((e)->e.episodeName).collect(Collectors.toList());
        System.out.println(episodeNames);

        List<Integer> episodeNumbers = seasons.stream().flatMap(season2 -> season2.episodes.stream()).map((n)-> n.episodeNumber).collect(Collectors.toList());
        System.out.println(episodeNumbers);

        List<String> videosName =  seasons.stream().flatMap(season2 -> season2.episodes.stream()).flatMap((e) -> e.videos.stream()).map((v)-> v.title).collect(Collectors.toList());
        System.out.println(videosName);

        List<String> adressUrl = seasons.stream().flatMap(season2 -> season2.episodes.stream()).flatMap((e) -> e.videos.stream()).map((u)-> u.url).collect(Collectors.toList());
        System.out.println(adressUrl);

        List<Episode> episodesEven = seasons.stream().filter((s)->s.seasonNumber %2 ==0 ).flatMap(season2 -> season2.episodes.stream()).collect(Collectors.toList());
        System.out.println(episodesEven);

    }
}



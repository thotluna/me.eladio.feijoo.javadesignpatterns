package me.eladiofeijoo.javadesingnpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class YouTubeLib implements YouTubeService{
    @Override
    public List<Video> listVideos() {
        System.out.println("Load list from youtube");
        List<Video> list = new ArrayList<>();
        list.add(new Video(1, "Java"));
        list.add(new Video(2, "JavaScript"));
        list.add(new Video(3, "GO"));
        list.add(new Video(4, "Rust"));
        return list;
    }

    @Override
    public String getVideoInformation(int id) {
        System.out.println("Load information from youtube");
        return "this video speak of language " + getVideo(id).video();
    }

    private Video getVideo(int id){
        return listVideos().stream()
                .filter(value -> id == value.id())
                .findFirst().orElse(null);
    }

    @Override
    public Video downloadVideo(int id) {
        System.out.println("Load video from youtube");
        return getVideo(id);
    }
}

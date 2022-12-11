package me.eladiofeijoo.javadesingnpatterns.structural.proxy;

import java.util.List;

public interface YouTubeService {
    List<Video> listVideos();
    String getVideoInformation(int id);
    Video downloadVideo(int id);
}

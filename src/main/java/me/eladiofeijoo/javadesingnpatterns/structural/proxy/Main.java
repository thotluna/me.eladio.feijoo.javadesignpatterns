package me.eladiofeijoo.javadesingnpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {

        YouTubeService cacheYouTube = new ProxyCacheYouTube();

        System.out.println("from youtube");
        System.out.println(cacheYouTube.listVideos());

        System.out.println("from cache");
        System.out.println(cacheYouTube.listVideos());

    }
}

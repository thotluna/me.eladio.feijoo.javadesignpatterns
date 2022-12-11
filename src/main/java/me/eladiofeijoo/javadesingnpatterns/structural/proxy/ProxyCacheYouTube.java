package me.eladiofeijoo.javadesingnpatterns.structural.proxy;

import java.util.List;

public class ProxyCacheYouTube implements YouTubeService{
    private YouTubeLib lib;
    private List<Video> list;

    public ProxyCacheYouTube() {
        this.lib = new YouTubeLib();
    }

    private void loadList(){
        if(list == null){
            list = lib.listVideos();
        }
    }

    private Video getVideo(int id){

        loadList();

        return listVideos().stream()
                .filter(value -> id == value.id())
                .findFirst().orElse(null);
    }

    @Override
    public List<Video> listVideos() {
        loadList();
        System.out.println("Load list from cache");
        return list;
    }

    @Override
    public String getVideoInformation(int id) {
        return lib.getVideoInformation(id);
    }

    @Override
    public Video downloadVideo(int id) {
        loadList();
        System.out.println("Load video from cache");
        Video video = getVideo(id);

        return video != null ? video : lib.downloadVideo(id);
    }
}

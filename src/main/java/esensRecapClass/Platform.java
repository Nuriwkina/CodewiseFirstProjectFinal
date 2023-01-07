package esensRecapClass;

public class Platform {
    public static void main(String[] args) {

        YoutubeVideo video = new YoutubeVideo();
        System.out.println(video.views);
        video.watch();
        video.watch();
        video.watch();
        video.like();
        video.comment("Hey great video");
        video.comment("Nah , is's lame");
        video.makePrivate();
        System.out.println(video.views);
        System.out.println(video.likes);
        System.out.println(video.comments);
        System.out.println(video.isPrivate);



    }

}

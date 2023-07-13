import processador.HDProcessador;
import processador.UHD4KProcessador;
import video.NetflixVideo;
import video.Video;
import video.YoutubeVideo;

public class Main {
    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new HDProcessador());
        youtubeVideo.executar("abc.mp4");
        Video netflixVideo = new YoutubeVideo(new UHD4KProcessador());
        netflixVideo.executar("abc.mp4");
        System.out.println("----");
        youtubeVideo = new NetflixVideo(new HDProcessador());
        youtubeVideo.executar("abc.mp4");
        netflixVideo = new NetflixVideo(new UHD4KProcessador());
        netflixVideo.executar("abc.mp4");
    }
}
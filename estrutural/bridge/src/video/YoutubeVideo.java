package video;

import processador.VideoProcessador;

public class YoutubeVideo extends Video{
    public YoutubeVideo(VideoProcessador processor) {
        super(processor);
    }

    @Override
    public void executar(String videoFile) {
        System.out.print("Sou o YOUTUBE");
        processor.processar(videoFile);
    }
}
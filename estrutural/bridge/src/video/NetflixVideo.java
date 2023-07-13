package video;

import processador.VideoProcessador;

public class NetflixVideo extends Video{
    public NetflixVideo(VideoProcessador processor) {
        super(processor);
    }

    @Override
    public void executar(String videoFile) {
        System.out.print("Sou a NETFLIX");
        processor.processar(videoFile);
    }
}

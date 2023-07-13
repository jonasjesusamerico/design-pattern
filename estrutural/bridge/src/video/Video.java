package video;

import processador.VideoProcessador;

public abstract class Video {
    protected VideoProcessador processor;
    public Video(VideoProcessador processor){
        this.processor = processor;
    }
    public abstract void executar(String videoFile);
}

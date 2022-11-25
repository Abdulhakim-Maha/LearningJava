import facade.VideoConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        File file = videoConversionFacade.convertVideo("youtubevideo.ogg", "mp4");
    }
}
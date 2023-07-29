import domain.AudioFile;
import facade.VideoConversionFacade;

import java.text.MessageFormat;

public class Application {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        AudioFile file = videoConversionFacade.convertToAudio("movie.ogg", "mpeg4");
        System.out.println(MessageFormat.format("FileName : {0}, CodecType : {1}", file.getFileName(), file.getCodecType()));
    }
}

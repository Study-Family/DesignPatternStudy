package facade;

import domain.AudioFile;
import domain.BitrateReader;
import domain.CodecType;
import domain.VideoFile;
import util.CodecFactory;

public class VideoConversionFacade {

    public AudioFile convertToAudio(String fileName, String format) {
        VideoFile videoFile = new VideoFile(fileName);
        CodecType convertCodecType = CodecType.getCodecType(format);
        VideoFile convertFile = BitrateReader.convert(videoFile, convertCodecType);
        return AudioFile.fix(convertFile);
    }
}

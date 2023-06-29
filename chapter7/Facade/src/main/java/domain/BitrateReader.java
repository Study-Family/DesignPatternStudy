package domain;

public class BitrateReader {

    public static VideoFile convert(VideoFile file, CodecType codecType) {
        int index = file.getFileName().indexOf(".");
        String fileName = file.getFileName().substring(0, index + 1) + codecType.getCodecName();
        return new VideoFile(fileName);
    }
}

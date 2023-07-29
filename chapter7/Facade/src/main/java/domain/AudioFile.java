package domain;


public class AudioFile {

    private String fileName;
    private CodecType codecType;

    public AudioFile(String fileName, CodecType codecType) {
        this.fileName = fileName;
        this.codecType = CodecType.getCodecType(getExtract(fileName));
    }

    private String getExtract(String fileName) {
        int index = fileName.indexOf(".");
        return fileName.substring(index + 1);
    }

    public static AudioFile fix(VideoFile convertFile) {
        return new AudioFile(convertFile.fileName, convertFile.codecType);
    }

    public String getFileName() {
        return fileName;
    }

    public CodecType getCodecType() {
        return codecType;
    }
}

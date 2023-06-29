package domain;

public class VideoFile {
    String fileName;
    CodecType codecType;

    public VideoFile(String fileName) {
        this.fileName = fileName;
        this.codecType = CodecType.getCodecType(getExtract(fileName));
    }

    private String getExtract(String fileName) {
        int index = fileName.indexOf(".");
        return fileName.substring(index + 1);
    }

    public CodecType getCodecType() {
        return codecType;
    }

    public String getFileName() {
        return fileName;
    }
}

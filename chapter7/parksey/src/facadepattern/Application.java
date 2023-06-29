package facadepattern;

import facadepattern.converter.File;
import facadepattern.converter.VideoConverter;

public class Application {
    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        File mp4 = videoConverter.convertVideo("funny-cats-video.ogg", "mp4");
        mp4.save();
    }
}

package chapter7.facade;

import chapter7.facade.subsystem.File;

public class Application {
	public static void main(String[] args) {
		VideoConverter videoConverter = new VideoConverter();
		File mp4 = videoConverter.convertVideo("funny-cast-video.ogg", "mp4");
		mp4.save();
	}
}

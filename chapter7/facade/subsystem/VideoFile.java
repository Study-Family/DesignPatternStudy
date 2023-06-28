package chapter7.facade.subsystem;

import chapter7.facade.model.Result;

public class VideoFile extends File{

	public VideoFile(String fileName) {
		super(fileName);
	}
	public VideoFile(Result result) {
		super(result);
	}
}

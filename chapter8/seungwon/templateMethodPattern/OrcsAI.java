package chapter8.seungwon.templateMethodPattern;

import java.util.ArrayList;
import java.util.List;

public class OrcsAI extends GameAI {
	protected List<String> buildStructures() {
		List<String> structures = new ArrayList<>();
		structures.add("farm");
		structures.add("castle");
		structures.add("stronghold");
		return structures;
	}

	protected void buildUnits() {
		System.out.println("Build peon, add it to scouts group.");
	}
}

package chapter6.invoker;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import chapter6.Command;
import chapter6.model.ShortCut;

public class ShortcutContainer {
	private List<ShortCut> shortCuts;

	public ShortcutContainer() {
		this.shortCuts = new ArrayList<>();
	}

	public void onKeyPress(String strCmd, Command command) {
		ShortCut shortCut = new ShortCut(strCmd, command);
		shortCuts.add(shortCut);
	}

	public ShortCut getShortCut(String strCmd) {
		Optional<ShortCut> optionalShortCut = shortCuts.stream()
			.filter(shortCut -> shortCut.isSame(strCmd))
			.findFirst();

		return optionalShortCut.orElseThrow(() -> new NoSuchElementException("일치하는 명령어가 없습니다."));
	}
}

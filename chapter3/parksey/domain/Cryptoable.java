package decoratepattern.puzzle.domain;

import java.security.NoSuchAlgorithmException;

public interface Cryptoable<T> {
    String parseCrtpto(String noraml) throws NoSuchAlgorithmException;
    String deparseCrytpto(String crypto);
}

s
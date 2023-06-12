package decoratepattern.puzzle.ui;

public class OutputView {
    private static final String 이름 = "이름 입력 : ";
    private static final String 전화번호 = "전화번호 입력 : ";
    private static final String 주소 = "주소 입력 : ";
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public void printName() {
        System.out.print(이름);
    }
}

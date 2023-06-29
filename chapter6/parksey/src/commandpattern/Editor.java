package commandpattern;

public class Editor {
    private String text;

    public Editor(String text) {
        this.text = text;
    }

    public String getSelection() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void deleteSelction() {
        this.text = "";
    }

    public void replaceSelection(String text) {
        this.text = text;
    }
}

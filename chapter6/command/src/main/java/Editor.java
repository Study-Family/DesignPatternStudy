public class Editor {

    public String text;

    public Editor(String text) {
        this.text = text;
    }

    public String getSelection(int start, int end) {
        return text.substring(start, end);
    }

    public void deleteSelection(int start, int end) {
        this.text = text.substring(0, start) + text.substring(end);
    }

    public void replaceSelection(int start, int end, String text) {
        this.text = this.text.substring(0, start) + text + this.text.substring(end);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                '}';
    }
}

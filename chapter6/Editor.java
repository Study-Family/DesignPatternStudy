package chapter6;

import chapter6.model.Text;

public class Editor {
	private Text editorText;

	public Text getSelection() {
		return this.editorText;
	}

	public void setEditorText(Text editorText) {
		this.editorText = editorText;
	}

	public void deleteSelection() {
		this.editorText.setText("");
	}

	public void replaceSelection(Text text) {
		this.editorText.setText(text.getText());
	}
}

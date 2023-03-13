package refactoring.chapter4.before;

public class Label {
    private final String _label;

    public Label(String _label) {
        this._label = _label;
    }

    public void display() {
        System.out.println("display : " + _label);
    }

    public String toString() {
        return "\"" + _label + "\"";
    }
}

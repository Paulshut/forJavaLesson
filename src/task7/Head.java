package task7;

public enum Head {
    BENDER_HEAD("Голова Бендера"),
    OPTUMUS_HEAD("Голова Оптимуса"),
    ROBOCOP_HEAD("Голова Робокопа");
    private String nameHead;

   private Head(String nameHead) {
        this.nameHead = nameHead;
    }

    public String getNameHead() {
        return nameHead;
    }
}
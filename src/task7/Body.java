package task7;

public enum Body {
    BENDER_BODY("тело Бендер"),
    OPTUMUS_BODY("тело Оптимус"),
    ROBOCOP_BODY("тело Робокоп");

    private String nameBody;

    private Body(String nameBody) {
        this.nameBody = nameBody;
    }

    public String getNameBody() {
        return nameBody;
    }
}
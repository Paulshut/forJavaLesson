package task7;

public class Robot {
    private Head head;
    private Body body;
    private String nameRobot;
    private String nameBody;
    private String nameHead;
    private Body[] bodies = {Body.BENDER_BODY, Body.OPTUMUS_BODY, Body.ROBOCOP_BODY};
    private Head[] heads = {Head.BENDER_HEAD, Head.OPTUMUS_HEAD, Head.ROBOCOP_HEAD};

    public Robot(String nameRobot) {
        this.nameRobot = nameRobot;
        this.head = new Factory().createHead();
        this.body = new Factory().createBody();
        this.nameBody = body.getNameBody();
        this.nameHead = head.getNameHead();
    }

    private class Factory implements task7.Factory {
        @Override
        public Body createBody() {
            int i = (int) (Math.random() * 3);
            return body = bodies[i];
        }

        @Override
        public Head createHead() {
            int i = (int) (Math.random() * 3);
            return head = heads[i];
        }

    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", body=" + body +
                ", nameRobot='" + nameRobot + '\'' +
                ", nameBody='" + nameBody + '\'' +
                ", nameHead='" + nameHead + '\'' +
                '}';
    }
}
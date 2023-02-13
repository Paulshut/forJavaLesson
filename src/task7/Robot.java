package task7;

import java.util.Random;

public class Robot {
    private Head head;
    private Body body;
    private String nameRobot;
    private String nameBody;
    private String nameHead;

    public Robot() {
        this.nameRobot = getNameRobot();
        this.head = new Factory().createHead();
        this.body = new Factory().createBody();
        this.nameBody = body.getNameBody();
        this.nameHead = head.getNameHead();
    }

    private class Factory implements task7.Factory {
        @Override
        public Body createBody() {
            Body[] bodies = {Body.BENDER_BODY, Body.OPTUMUS_BODY, Body.ROBOCOP_BODY};
            int i = (int) (Math.random() * 3);
            return body = bodies[i];
        }

        @Override
        public Head createHead() {
            Head[] heads = {Head.BENDER_HEAD, Head.OPTUMUS_HEAD, Head.ROBOCOP_HEAD};
            int i = (int) (Math.random() * 3);
            return head = heads[i];
        }

    }

    private String getNameRobot() {
        int l = 1;
        char ch;
        String nameRobot;
        Random random = new Random();
        nameRobot = String.valueOf((char) (random.nextInt(26) + 'A'));
        while (l < 5) {
            ch = (char) (random.nextInt(26) + 'a');
            nameRobot = nameRobot + ch;
            l++;
        }
        return nameRobot;
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
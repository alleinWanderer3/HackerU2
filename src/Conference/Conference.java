package Conference;

public class Conference {
    String topic;
    static int period;

    public Conference(String topic) {
        this.topic = topic;
    }

    public void showTopic(int period) {
        System.out.println("topic");
    }

    public static void showPeriod() {
        System.out.println("period");

    }

}

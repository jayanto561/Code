interface State {
    void handle(FanContext fan);
}

class OffState implements State {
    public void handle(FanContext fan) {
        System.out.println("Fan is OFF --Switching to HIGH");
        fan.setState(new HighState());
    }
}

class HighState implements State {
    public void handle(FanContext fan) {
        System.out.println("Fan is HIGH --Switching to OFF");
        fan.setState(new OffState());
    }
}

class FanContext {
    private State state;

    public FanContext() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press() {
        state.handle(this);
    }
}

public class Final {
    public static void main(String[] args) {
        FanContext fan = new FanContext();
        fan.press();
        fan.press();
    }
}

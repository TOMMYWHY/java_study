package demo;

public class StatePatten {
    public static void main(String[] args) {
        Context tommy = new Context();
        tommy.changeState(new Sad());
        tommy.doSome();
        tommy.changeState(new Happy());
        tommy.doSome();
    }
}
abstract class State{
    abstract void doWork();
}

class Happy extends State{
    @Override
    void doWork() {
        System.out.println("happy~!");
    }
}
class Sad extends State{
    @Override
    void doWork() {
        System.out.println("saddddd....");
    }
}

class Context{
    private State state;
    public void changeState(State state){
        this.state = state;
    }
    public void doSome(){
        state.doWork();
    }
}
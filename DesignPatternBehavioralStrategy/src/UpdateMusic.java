public class UpdateMusic {
    private Strategy strategy;

    public UpdateMusic(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}

package strategy.problem;

public class StrategyProblemMain {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage("jpeg","black_white");
        storage.store("sample image");
    }
}

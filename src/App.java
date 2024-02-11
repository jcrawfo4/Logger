public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        asteriskLogger.log("Hello");
        asteriskLogger.error("World");
        spacedLogger.log("Hello");
        spacedLogger.error("World");
    }
}
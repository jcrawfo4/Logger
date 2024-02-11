public class SpacedLogger implements Logger {
    public void log(String log) {
        StringBuilder spacedLog = new StringBuilder();
        for (int i = 0; i < log.length(); i++) {
            spacedLog.append(log.charAt(i)).append(" ");
        }
        System.out.println(spacedLog);
    }

    public void error(String error) {
        StringBuilder spacedError = new StringBuilder();
        for (int i = 0; i < error.length(); i++) {
            spacedError.append(error.charAt(i)).append(" ");
        }
        System.out.println("ERROR: " + spacedError);
    }
}

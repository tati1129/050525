package prof.homeworks._06_18_Lesson1.encapsulation.task3;

public class SystemConfiguration {
    private String logLevel;
    private String logFilePath;


    public SystemConfiguration(String logLevel, String logFilePath) {
        this.logLevel = logLevel;
        this.logFilePath = logFilePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }


    @Override
    public String toString() {
        return "SystemConfiguration{" +
                "logLevel='" + logLevel + '\'' +
                ", logFilePath='" + logFilePath + '\'' +
                '}';
    }
}

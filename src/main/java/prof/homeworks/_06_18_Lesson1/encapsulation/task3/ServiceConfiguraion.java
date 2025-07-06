package prof.homeworks._06_18_Lesson1.encapsulation.task3;

public class ServiceConfiguraion {

    SystemConfiguration systemConfiguration;

    public ServiceConfiguraion(SystemConfiguration systemConfiguration) {
        this.systemConfiguration = systemConfiguration;
    }

    public String updateLogLevel(String logLevel) {
        if (isValidLogLevel(logLevel)) {
            systemConfiguration.setLogLevel(logLevel);
            return "Уровень логирования успешно обновлен на " + logLevel;
        } else {
            return "Ошибка! Недопустимый уровень логирования: " + logLevel;
        }
    }

    public String updateLogFilePath(String logFilePath) {
        if (logFilePath != null && !logFilePath.trim().isEmpty()) {
            systemConfiguration.setLogFilePath(logFilePath);
            return "Путь к файлам логов успешно обновлен";
        } else {
            return "Ошибка! Путь к файлам логов не может быть пустым.";
        }
    }

    private boolean isValidLogLevel(String logLevel) {
        String[] validLogLevel = {"DEBUG", "INFO", "WARN", "ERROR"};
        for (String validLevel : validLogLevel) {
            if (validLevel.equalsIgnoreCase(logLevel)) {
                return true;
            }
        }
        return false;
    }

    public SystemConfiguration getSystemConfiguration() {
        return systemConfiguration;
    }
}

package decorator;

import java.util.ArrayList;
import java.util.List;

interface Logger{
    void debug(String msg);
    void info(String msg);
    void error(String msg);
}

class ConsoleLogger implements Logger{

    @Override
    public void debug(String msg) {
        System.out.println(msg);
    }

    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void error(String msg) {
        System.out.println(msg);
    }
}

class FileLogger implements Logger{
    private Logger logger;
    private List<String> logFile = new ArrayList<>();
    
    public FileLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void debug(String msg) {
        logger.debug(msg);
        logFile.add(msg);
        System.out.println(logFile);
    }

    @Override
    public void info(String msg) {
        logger.info(msg);
        logFile.add(msg);
        System.out.println(logFile);
    }

    @Override
    public void error(String msg) {
        logger.error(msg);
        logFile.add(msg);
        System.out.println(logFile);
    }
}


public class LoggerDemo {
    private static Logger logger = new ConsoleLogger();
    
    public static void main(String[] args) {
        Logger logger1 = logger;
        logger1.debug("在命令行中输出Debug信息");
        
        FileLogger fLogger = new FileLogger(logger1);
        fLogger.debug("文件中也输出");
        
    }
}

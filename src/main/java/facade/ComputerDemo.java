package facade;

import org.apache.log4j.Logger;

/**
 * facade 模式
 * 
 * 
 * 
 * 
 * 
 * 
 * @author martin.wang
 * @see http://blog.csdn.net/jason0539/article/details/22775311
 */
class CPU {
    public static final Logger LOGGER = Logger.getLogger(CPU.class);
    
    public void start() {
        LOGGER.info("CPU is starting...");
    }
    
    public void shutdown() {
        LOGGER.info("CPU is shuting down...");
    }
}

class Disk {
    public static final Logger LOGGER = Logger.getLogger(Disk.class);
    
    public void start() {
        LOGGER.info("Disk is starting...");
    }
    
    public void shutdown() {
        LOGGER.info("Disk is shuting down...");
    }
}

class Memory {
    public static final Logger LOGGER = Logger.getLogger(Disk.class);
    
    public void start() {
        LOGGER.info("Memory is starting...");
    }
    
    public void shutdown() {
        LOGGER.info("Memory is shuting down...");
    }
}

class Computer {
    public static final Logger LOGGER = Logger.getLogger(Disk.class);
    private CPU cpu;
    private Disk disk;
    private Memory memory;
    
    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }
    
    public void start() {
        LOGGER.info("computer starting.");
        cpu.start();
        disk.start();
        memory.start();
        LOGGER.info("Computer started.");
    }
    
    public void shutdown() {
        LOGGER.info("computer shuting down.");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        LOGGER.info("Computer shutted down.");
    }
}

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("--------------------");
        computer.shutdown();
    }
}

package Abstract_Factory_Pattern;

// 抽象产品接口：操作系统
interface OperatingSystem {
    void run();
}

// 具体产品：Windows操作系统
class WindowsOS implements OperatingSystem {
    @Override
    public void run() {
        System.out.println("Running Windows OS");
    }
}

// 具体产品：Linux操作系统
class LinuxOS implements OperatingSystem {
    @Override
    public void run() {
        System.out.println("Running Linux OS");
    }
}

// 抽象产品接口：应用程序
interface Application {
    void open();
}

// 具体产品：Word应用程序
class WordApplication implements Application {
    @Override
    public void open() {
        System.out.println("Opening Word Abstract_Factory_Pattern.Application");
    }
}

// 具体产品：Excel应用程序
class ExcelApplication implements Application {
    @Override
    public void open() {
        System.out.println("Opening Excel Abstract_Factory_Pattern.Application");
    }
}

// 抽象工厂接口
interface SoftwareFactory {
    OperatingSystem createOperatingSystem();
    Application createApplication();
}

// 具体工厂：Windows工厂
class WindowsFactory implements SoftwareFactory {
    @Override
    public OperatingSystem createOperatingSystem() {
        return new WindowsOS();
    }

    @Override
    public Application createApplication() {
        return new ExcelApplication();
    }
}

// 具体工厂：Linux工厂
class LinuxFactory implements SoftwareFactory {
    @Override
    public OperatingSystem createOperatingSystem() {
        return new LinuxOS();
    }

    @Override
    public Application createApplication() {
        return new WordApplication();
    }
}

// 在这个示例中，抽象工厂模式通过SoftwareFactory接口和其实现类来创建不同类型的操作系统和应用程序。
// 客户端代码可以根据需要选择不同的工厂实例来创建不同的产品组合。
public class Client {
    public static void main(String[] args) {
        SoftwareFactory windowsFactory = new WindowsFactory();
        OperatingSystem windowsOS = windowsFactory.createOperatingSystem();
        Application windowsApp = windowsFactory.createApplication();

        windowsOS.run();
        windowsApp.open();

        SoftwareFactory linuxFactory = new LinuxFactory();
        OperatingSystem linuxOS = linuxFactory.createOperatingSystem();
        Application linuxApp = linuxFactory.createApplication();

        linuxOS.run();
        linuxApp.open();
    }
}
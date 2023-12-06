package Singleton;

public class Singleton {
    // 私有静态成员变量，用于保存单例实例
    private static Singleton instance;

    // 私有构造方法，防止外部实例化
    private Singleton() {
        // 初始化操作
    }

    // 公共静态方法，用于获取单例实例
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            // 如果实例为空，则创建一个新实例
            instance = new Singleton();
        }
        return instance;
    }

    // 其他成员方法
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

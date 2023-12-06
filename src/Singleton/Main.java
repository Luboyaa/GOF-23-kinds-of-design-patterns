package Singleton;

// 这个示例演示了如何创建一个简单的单例模式
// 但请注意，这个实现并不是线程安全的。
// 在多线程环境中，可能会出现多个线程同时访问getInstance()方法，导致创建多个实例的情况。
// 为了实现线程安全的单例模式，可以使用双重检查锁定或其他同步机制。
public class Main {
    public static void main(String[] args) {
        // 获取单例实例
        Singleton singleton = Singleton.getInstance();


        // 调用成员方法
        singleton.showMessage();
    }
}
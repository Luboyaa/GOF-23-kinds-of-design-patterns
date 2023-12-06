package Bridge_Pattern;


// 实现部分 - 颜色接口
interface Color {
    void applyColor();
}

class Red implements Color {
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class Blue implements Color {
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
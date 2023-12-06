package Builder;

// 首先，我们定义房屋类 Builder.House，它具有多个属性，如地基、结构、屋顶和装修。
class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Builder.House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior + "]";
    }
}
// 然后，我们创建一个抽象建造者类 Builder.HouseBuilder，它定义了构建房屋的方法。
abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildInterior();

    public House getHouse() {
        return house;
    }
}
// 接下来，我们创建两个具体的建造者类 Builder.ConcreteHouseBuilder 和 Builder.LuxuryHouseBuilder
// 分别实现了不同类型房屋的构建过程。
// 具体建造者类 - 普通房屋
class ConcreteHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() {
        house.setFoundation("Standard Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Standard Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Standard Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Standard Interior");
    }
}

// 具体建造者类 - 豪华房屋
class LuxuryHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() {
        house.setFoundation("Strong Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Reinforced Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Elegant Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Luxury Interior");
    }
}
// 最后，我们创建指导者类 Builder.Director，它协调建造过程并返回构建的房屋对象。
class Director {
    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
        return builder.getHouse();
    }
}
// 这个示例演示了如何使用建造者模式创建不同类型的房屋，每种房屋类型的建造过程都由相应的具体建造者类负责实现，而指导者类负责协调建造过程。
public class BuilderPatternExample {
    public static void main(String[] args) {
        HouseBuilder concreteBuilder = new ConcreteHouseBuilder();
        Director director1 = new Director(concreteBuilder);
        House concreteHouse = director1.constructHouse();
        System.out.println("Concrete Builder.House: " + concreteHouse);



        HouseBuilder luxuryBuilder = new LuxuryHouseBuilder();
        Director director2 = new Director(luxuryBuilder);
        House luxuryHouse = director2.constructHouse();
        System.out.println("Luxury Builder.House: " + luxuryHouse);
    }
}
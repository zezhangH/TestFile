package testfile;

public class TestMethod {
    public void tesyOne() {
        this.testTwo();
        System.out.println("我是TestOne方法");
    }

    public void testTwo() {
        this.testThree();
        System.out.println("我是TestTwo方法");
    }

    public void testThree() {
        System.out.println("我是TestThree方法");
    }

    public void buildTower(int floor) {
        if (floor > 1) {
            this.buildTower(floor - 1);
        }
        System.out.println("盖到第" + floor + "层宝塔");
    }

    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.tesyOne();
        tm.buildTower(5);
    }
}

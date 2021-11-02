import org.junit.Assert;
import org.junit.Test;

public class AreaCalculatorTest {

    @Test
    public void TestAreaRectangle(){
        Rectangle rectangle = new Rectangle(5,4);
        double area = rectangle.computeArea();
        Assert.assertEquals(20,area,0.01);
    }
    @Test
    public void TestSetAndGetHeight(){
        Rectangle rectangle = new Rectangle(5,4);
        rectangle.setHeight(10);
        Assert.assertEquals(10,rectangle.getHeight(),0.01);
    }
    @Test
    public void TestSetAndGetWidth(){
        Rectangle rectangle = new Rectangle(5,4);
        rectangle.setWidth(8);
        Assert.assertEquals(8,rectangle.getWidth(),0.01);
    }
    @Test
    public void TestAreaSquare(){
        Square square = new Square(5);
        double area = square.computeArea();
        Assert.assertEquals(25,area,0.01);
    }
    @Test
    public void TestSetAndGetSide(){
        Square square = new Square(5);
        square.setSide(7);
        Assert.assertEquals(7,square.getSide(),0.01);
    }
}


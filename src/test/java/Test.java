import com.example.JSFLab.PointData;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Test {
    private final PointData result = new PointData();

    @org.junit.Test
    public void hitCircle() {
        result.setX(-2.0);
        result.setY(-2.0);
        result.setR(1.0);
        assertFalse(result.check());
    }

    @org.junit.Test
    public void hitCircleFarBorder() {
        result.setX(-1.6);
        result.setY(-1.15);
        result.setR(2.0);
        assertTrue(result.check());
    }

    @org.junit.Test
    public void hitCircleLowBorder() {
        result.setX(-0.8);
        result.setY(0.05);
        result.setR(2.0);
        assertTrue(result.check());
    }


    @org.junit.Test
    public void missCircle() {
        result.setX(-3.5);
        result.setY(-1.6);
        result.setR(2.0);
        assertFalse(result.check());
    }

    @org.junit.Test
    public void missCircleFarBorder() {
        result.setX(-0.8);
        result.setY(-1.9);
        result.setR(2.0);
        assertFalse(result.check());
    }

    @org.junit.Test
    public void missCircleLowBorder() {
        result.setX(-2.0);
        result.setY(-0.49);
        result.setR(2.0);
        assertFalse(result.check());
    }

    @org.junit.Test
    public void hitTriangle() {
        result.setX(-1.0);
        result.setY(1.25);
        result.setR(3.0);
        assertTrue(result.check());
    }

    @org.junit.Test
    public void hitTriangleLowBorder() {
        result.setX(-2.5);
        result.setY(-0.75);
        result.setR(3.0);
        assertTrue(result.check());
    }

    @org.junit.Test
    public void hitTriangleTopBorder() {
        result.setX(-0.9);
        result.setY(2.41);
        result.setR(3.0);
        assertTrue(result.check());
    }

    @org.junit.Test
    public void missTriangle() {
        result.setX(-3.4);
        result.setY(3.35);
        result.setR(3.0);
        assertFalse(result.check());
    }
    

    @org.junit.Test
    public void hitRectangle() {
        result.setX(1.7);
        result.setY(0.78);
        result.setR(3.0);
        assertTrue(result.check());
    }

    @org.junit.Test
    public void missRectangle() {
        result.setX(3.8);
        result.setY(3.05);
        result.setR(3.0);
        assertFalse(result.check());
    }

    @org.junit.Test
    public void rSwitch() {
        result.setX(-0.5);
        result.setY(0.0);
        result.setR(1.0);
        assertTrue(result.check());
        result.setR(2.5);
        assertTrue(result.check());
        result.setR(3.0);
        assertTrue(result.check());
    }
}
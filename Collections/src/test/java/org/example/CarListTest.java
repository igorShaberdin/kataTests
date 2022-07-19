package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {

    private CarList carList;


    @Before
    public void setUp() throws Exception {
        carList = new CarArrayList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" +i, i));
        }
    }

    @Test
    public void whenAdded100ElementsThenSize100() {
        assertEquals(100, carList.size());
    }

    @Test
    public void whenRemoveCarIndex() {
        assertTrue(carList.removeAt(4));
        assertEquals(99, carList.size());
    }

    @Test
    public void whenRemoveCar() {
        Car car = new Car("Vespa", 12);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void whenRemoveNoCarReturnFalse() {
        Car car = new Car("Vespa", 12);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void clearAll() {
        carList.clear();
        assertEquals(0, carList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBounds() {
        carList.get(100);
    }

    @Test
    public void whenGetBrand() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }
}
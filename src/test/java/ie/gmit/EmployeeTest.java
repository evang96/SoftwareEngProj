package ie.gmit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    void setup(){

    }
    @DisplayName("Test")
    @Test
    void testConstructor(){
        Employee myEmployee = new Employee("mr","caleb","12345678","123456789","full",23);
        assertEquals("caleb",myEmployee.getTitle());

    }

}

package cse565;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class VendingMachineTest {

    @Test
    void constructVendingMachine() {
        new VendingMachine();
    }

    @Test
    void candyExactChange() {
        assertEquals("Item dispensed.",
                VendingMachine.dispenseItem(20, "candy"));
    }

    @Test
    void candyOverpayment() {
        assertEquals("Item dispensed and change of 10 returned",
                VendingMachine.dispenseItem(30, "candy"));
    }

    @Test
    void candyInsufficientFunds() {
        assertEquals("Item not dispensed, missing 10 cents. Cannot purchase item.",
                VendingMachine.dispenseItem(10, "candy"));
    }

    @Test
    void cokeExactChange() {
        assertEquals("Item dispensed.",
                VendingMachine.dispenseItem(25, "coke"));
    }

    @Test
    void cokeOverpayment() {
        assertEquals("Item dispensed and change of 5 returned",
                VendingMachine.dispenseItem(30, "coke"));
    }

    @Test
    void cokeNearThreshold() {
        assertEquals("Item not dispensed, missing 3 cents. Can purchase candy.",
                VendingMachine.dispenseItem(22, "coke"));
    }

    @Test
    void cokeLowFunds() {
        assertEquals("Item not dispensed, missing 10 cents. Cannot purchase item.",
                VendingMachine.dispenseItem(15, "coke"));
    }

    @Test
    void coffeeExactChange() {
        assertEquals("Item dispensed.",
                VendingMachine.dispenseItem(45, "coffee"));
    }

    @Test
    void coffeeOverpayment() {
        assertEquals("Item dispensed and change of 10 returned",
                VendingMachine.dispenseItem(55, "coffee"));
    }

    @Test
    void coffeeInsufficientHighFunds() {
        assertEquals("Item not dispensed, missing 10 cents. Can purchase candy or coke.",
                VendingMachine.dispenseItem(35, "coffee"));
    }

    @Test
    void coffeeNearThreshold() {
        assertEquals("Item not dispensed, missing 22 cents. Can purchase candy.",
                VendingMachine.dispenseItem(23, "coffee"));
    }

    @Test
    void coffeeLowFunds() {
        assertEquals("Item not dispensed, missing 29 cents. Cannot purchase item.",
                VendingMachine.dispenseItem(16, "coffee"));
    }
}
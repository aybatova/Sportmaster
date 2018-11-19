package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterTest {

    @Test
    void calculateBonus() {

        {
            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(100, 1_000);

            assertEquals(0, bonus);

        }
        {
            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(1_000, 14_000);

            assertEquals(50, bonus);

        }
        {
            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(1, 15_001);

            assertEquals(0, bonus);

        }
        {
            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(1_000, 15_001);

            assertEquals(70, bonus);

        }
        {
            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(100, 150_000);

            assertEquals(0, bonus);

        }
        {
            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(1_000, 150_001);

            assertEquals(100, bonus);

        }
        {

            Sportmaster service = new Sportmaster();

            int bonus = service.calculateBonus(1_000, 0);

            assertEquals(50, bonus);
        }

    }
}

package com.openlearn.api.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

/**
 * Utility class specific to methods that do some type of calculation.
 */
public class CalculationUtil {

    /**
     * Calculates number of years based on the date provided
     * Useful for calculating age.
     * @param date the date to calculate number of years from today.
     * @return Optional<Number>:  number of years
     */
    public static Optional<Integer> calculateNumberOfYearsFromToday(LocalDate date) {
        if (date != null) {
            return Optional.of(
                    Period.between(date, LocalDate.now()).getYears()
            );
        }
        return null;
    }
}

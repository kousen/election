package com.kousenit.election.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Objects;

@Component
public class Agony {
    public static final LocalDate ELECTION_DAY_2018 =
            LocalDate.of(2018, Month.NOVEMBER, 6);
    public static final LocalDate ELECTION_DAY_2020 =
            LocalDate.of(2020, Month.NOVEMBER, 3);
    private final String daysToElectionDay2018;
    private final String daysToElectionDay2020;

    public Agony() {
        LocalDate now = LocalDate.now();

        Period to2018 = now.until(ELECTION_DAY_2018);
        Period to2020 = now.until(ELECTION_DAY_2020);

        daysToElectionDay2018 = format(to2018);
        daysToElectionDay2020 = format(to2020);
    }

    private String format(Period period) {
        return String.format("%d year(s), %d month(s), %d day(s)",
                period.getYears(), period.getMonths(), period.getDays());
    }

    public String getDaysToElectionDay2018() {
        return daysToElectionDay2018;
    }

    public String getDaysToElectionDay2020() {
        return daysToElectionDay2020;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agony agony = (Agony) o;
        return Objects.equals(daysToElectionDay2018, agony.daysToElectionDay2018) &&
                Objects.equals(daysToElectionDay2020, agony.daysToElectionDay2020);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daysToElectionDay2018, daysToElectionDay2020);
    }

    @Override
    public String toString() {
        return "Agony{" +
                "daysToElectionDay2018='" + daysToElectionDay2018 + '\'' +
                ", daysToElectionDay2020='" + daysToElectionDay2020 + '\'' +
                '}';
    }
}

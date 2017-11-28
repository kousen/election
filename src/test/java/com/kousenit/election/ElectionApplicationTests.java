package com.kousenit.election;

import com.kousenit.election.beans.Agony;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static com.kousenit.election.beans.Agony.ELECTION_DAY_2018;
import static com.kousenit.election.beans.Agony.ELECTION_DAY_2020;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElectionApplicationTests {

    @Autowired
    private Agony agony;

    @Test
    public void contextLoads() {
    }

    @Test
    public void daysToElectionDays() {
        String to2018 = agony.getDaysToElectionDay2018();
        String to2020 = agony.getDaysToElectionDay2020();

        Period p = parseFormattedString(to2018);
        Period until = LocalDate.now().until(ELECTION_DAY_2018);
        assertEquals(until, p);

        p = parseFormattedString(to2020);
        until = LocalDate.now().until(ELECTION_DAY_2020);
        assertEquals(until, p);
    }

    private Period parseFormattedString(String s) {
        String[] strings = s.split(" ");
        return Period.of(Integer.parseInt(strings[0]),
                Integer.parseInt(strings[2]),
                Integer.parseInt(strings[4]));
    }
}

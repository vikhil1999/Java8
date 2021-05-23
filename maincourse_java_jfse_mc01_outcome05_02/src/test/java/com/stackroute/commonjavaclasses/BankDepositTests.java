package com.stackroute.commonjavaclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Period;

/* Write test cases for positive and negative scenarios*/
public class BankDepositTests {
    @Test
    public void givenMaturityDateThenShouldReturnDate1(){
        Assertions.assertEquals("20/11/2021",new BankDeposit().getMaturityDate("20/11/1998", Period.of(23,0,0)));
    }
    @Test
    public void givenMaturityDateThenShouldReturnDate2(){
        Assertions.assertEquals("20/11/2022",new BankDeposit().getMaturityDate("20/11/1998", Period.of(24,0,0)));
    }
    @Test
    public void givenMaturityDateThenShouldReturnDate3(){
        Assertions.assertEquals("19/2/2022",new BankDeposit().getMaturityDate("20/11/1998",Period.of(23,2,30)));
    }
    @Test
    public void givenMaturityDateThenShouldReturnDate4(){
        Assertions.assertEquals("20/1/2022",new BankDeposit().getMaturityDate("20/11/1998",Period.of(23,2,0)));
    }
    @Test
    public void givenMaturityInvestmentThenShouldReturnDuration(){
        Assertions.assertEquals("23/0/0",new BankDeposit().getInvestmentDuration("20/11/1998","20/11/2021"));
    }
    @Test
    public void givenMaturityInvestmentThenShouldReturnDuration1(){
        Assertions.assertEquals("24/0/0",new BankDeposit().getInvestmentDuration("20/11/1998","20/11/2022"));
    }
    @Test
    public void givenMaturityInvestmentThenShouldReturnDuration2(){
        Assertions.assertEquals("23/2/30",new BankDeposit().getInvestmentDuration("20/11/1998","19/02/2022"));
    }
    @Test
    public void givenMaturityInvestmentThenShouldReturnDuration3(){
        Assertions.assertEquals("23/2/0",new BankDeposit().getInvestmentDuration("20/11/1998","20/01/2022"));
    }
    @Test
    public void givenMaturityInvestmentThenShouldReturnDuration4(){
        Assertions.assertEquals("23/1/0",new BankDeposit().getInvestmentDuration("20/11/1998","20/12/2021"));
    }
    @Test
    public void givenMaturityInvestmentThenShouldReturnDuration5(){
        Assertions.assertEquals("3/8/30",new BankDeposit().getInvestmentDuration("26/11/2021","25/08/2025"));
    }
}

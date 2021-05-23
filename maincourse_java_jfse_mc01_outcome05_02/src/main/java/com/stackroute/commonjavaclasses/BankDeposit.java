package com.stackroute.commonjavaclasses;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/* Complete the class as per the requirements given in PROBLEM.md */
public class BankDeposit {
    String getMaturityDate(String investmentDate, Period duration){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate=LocalDate.parse(investmentDate,formatter);
        LocalDate maturityDate=localDate.plus(duration);
        String result=maturityDate.getDayOfMonth()+"/"+maturityDate.getMonthValue()+"/"+maturityDate.getYear();
        return result;
    }
    String getInvestmentDuration(String investmentDate,String maturityDate){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate investment=LocalDate.parse(investmentDate,formatter);
        LocalDate maturity=LocalDate.parse(maturityDate,formatter);
        Period duration=Period.between(investment,maturity);
        String duration1=duration.getYears()+"/"+duration.getMonths()+"/"+duration.getDays();
        return duration1;
    }
}

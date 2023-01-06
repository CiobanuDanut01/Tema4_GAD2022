package src.main;

import java.io.Serializable;
import java.util.Objects;

public class Athlete implements Serializable {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstSR;
    private String secondSR;
    private String thirdSR;

    public Athlete(int number, String name, String country, String result, String first, String second, String third){
        this.athleteNumber = number;
        this.athleteName = name;
        this.countryCode = country;
        this.skiTimeResult=result;
        this.firstSR = first;
        this.secondSR=second;
        this.thirdSR=third;
    }

    public int getResult(){
        int countMisses;
        countMisses = count();
        int finalResult;
        int temp = countMisses * 10;
        int time;
        time=toSeconds(this.skiTimeResult);
        time = time + temp;
        finalResult = time;
        return finalResult;
    }

    public static int toSeconds(String s){
        String[] minSec = s.split(":");
        int mins = Integer.parseInt(minSec[0]);
        int sec = Integer.parseInt(minSec[1]);
        int minsInSec = mins * 60;
        return (minsInSec + sec);
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getSkiTimeResult() {
        return skiTimeResult;
    }

    public String getFirstSR() {
        return firstSR;
    }

    public String getSecondSR() {
        return secondSR;
    }

    public String getThirdSR() {
        return thirdSR;
    }

    public int count(){
        int count=0;
        char[] temp;
        String allSR = this.firstSR+this.secondSR+this.thirdSR;
        temp = allSR.toCharArray();
        for(int i = 0;i<15;i++){
            if(temp[i] == 'o'){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult='" + skiTimeResult + '\'' +
                ", initial time in seconds='" + toSeconds(skiTimeResult) + '\'' +
                ", total time='" + getResult() + '\'' +
                ", misses='" + count() + '\'' +
                ", firstSR='" + firstSR + '\'' +
                ", secondSR='" + secondSR + '\'' +
                ", thirdSR='" + thirdSR +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete that = (Athlete) o;
//        if(athleteName != null ? !athleteName.equals(that.athleteName) : that.athleteName != null ) return false;
        if(athleteNumber != that.athleteNumber) return false;
//        if(countryCode != that.countryCode) return false;
//        if(skiTimeResult != that.skiTimeResult) return false;
//        if(firstSR != that.firstSR) return false;
//        if(secondSR != that.secondSR) return false;
        return thirdSR != null ? thirdSR.equals(that.thirdSR) : that.thirdSR == null;
    }

    @Override
    public int hashCode() {
        int result = athleteName != null ? athleteName.hashCode() : 0;
        result = 31*result+athleteNumber;
//        result = 31*result+(countryCode != null ? countryCode.hashCode() : 0);
//        result = 31*result+(skiTimeResult != null ? skiTimeResult.hashCode() : 0);
//        result = 31*result+(firstSR != null ? firstSR.hashCode() : 0);
//        result = 31*result+(secondSR != null ? secondSR.hashCode() : 0);
//        result = 31*result+(thirdSR != null ? thirdSR.hashCode() : 0);
        return result;
    }
}

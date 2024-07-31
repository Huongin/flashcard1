package entity;

import java.util.Date;
import java.util.List;

import entity.User;




public class TestDetail {
    private User user;
    private Test test;
    private Date testDate; //Ngày làm test
    private List<Card> corectCard;
    private List<Card> incorrectCard;
    private int Score;

    public TestDetail(User user, Test test, Date testDate, List<Card> corectCard, List<Card> incorrectCard, int score) {
        this.user = user;
        this.test = test;
        this.testDate = testDate;
        this.corectCard = corectCard;
        this.incorrectCard = incorrectCard;
        Score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public List<Card> getCorectCard() {
        return corectCard;
    }

    public void setCorectCard(List<Card> corectCard) {
        this.corectCard = corectCard;
    }

    public List<Card> getIncorrectCard() {
        return incorrectCard;
    }

    public void setIncorrectCard(List<Card> incorrectCard) {
        this.incorrectCard = incorrectCard;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "TestDetail{" +
                "user=" + user +
                ", test=" + test +
                ", testDate=" + testDate +
                ", corectCard=" + corectCard +
                ", incorrectCard=" + incorrectCard +
                ", Score=" + Score +
                '}';
    }
}
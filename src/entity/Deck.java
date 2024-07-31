package entity;

import java.util.Date;
import java.util.List;
import constant.Level;



public class Deck {
    private String topic;
    private Level level; //Mức độ đánh giá theo kỳ thi JLPT
    private List<Card> cards; //Danh sách các thẻ học
    private Date createdDate; //Ngày tạo bộ thẻ
    private String description; //Mô tả nội dung, nguồn tài liệu

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "topic='" + topic + '\'' +
                ", level=" + level.getValue()+
                ", cards=" + cards +
                ", createdDate=" + createdDate +
                ", description='" + description + '\'' +
                '}';
    }
}

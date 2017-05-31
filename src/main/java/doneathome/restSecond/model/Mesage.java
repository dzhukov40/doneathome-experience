package doneathome.restSecond.model;

import doneathome.restSecond.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dzhukov on 27.05.17.
 */
@Entity
@Table(name="Message")
public class Mesage extends BaseEntity {

    private Long id;
    private Long fromUserId;
    private Long toUserId;
    private String message;
    private Date sendTime;


    public Mesage() {
    }

    public Mesage(Long fromUserId, Long toUserId, String message) {

        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.message = message;
    }

    @Id
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "Mesage{" +
                "id=" + id +
                ", fromUserId=" + fromUserId +
                ", toUserId=" + toUserId +
                ", message='" + message + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}

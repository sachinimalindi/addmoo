/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class Message implements Serializable {
    private int messageId;
    private String subject;
    private String messageTest;
    private List<login> to;
    private User from;

    /**
     * @return the messageId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="MessageId",length=12,nullable=false)
    public int getMessageId() {
        return messageId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    /**
     * @return the subject
     */
    @Column(name="Subject",length=100,nullable=false)
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the messageTest
     */
    @Column(name="MessageTest",length=255,nullable=false)
    public String getMessageTest() {
        return messageTest;
    }

    /**
     * @param messageTest the messageTest to set
     */
    public void setMessageTest(String messageTest) {
        this.messageTest = messageTest;
    }

    /**
     * @return the to
     */
    public List<login> getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(List<login> to) {
        this.to = to;
    }

    /**
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(User from) {
        this.from = from;
    }

}

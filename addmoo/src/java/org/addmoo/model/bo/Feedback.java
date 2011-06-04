/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
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
public class Feedback implements Serializable {
    private int feedbackId;
    private int PositiveFeedback=0;
    private int NegativeFeedback=0;

    /**
     * @return the feedbackId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getFeedbackId() {
        return feedbackId;
    }

    /**
     * @param feedbackId the feedbackId to set
     */
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * @return the PositiveFeedback
     */
    @Column(name="PositiveFeedback",length=8)
    public int getPositiveFeedback() {
        return PositiveFeedback;
    }

    /**
     * @param PositiveFeedback the PositiveFeedback to set
     */
    public void setPositiveFeedback(int PositiveFeedback) {
        this.PositiveFeedback = PositiveFeedback;
    }

    /**
     * @return the NegativeFeedback
     */
     @Column(name="NegativeFeedback",length=8)
    public int getNegativeFeedback() {
        return NegativeFeedback;
    }

    /**
     * @param NegativeFeedback the NegativeFeedback to set
     */
    public void setNegativeFeedback(int NegativeFeedback) {
        this.NegativeFeedback = NegativeFeedback;
    }
}

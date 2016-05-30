/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author prath
 */
public class votes {
    private int funny;
    private int useful;
    private int cool;
    private String review_id;

    /**
     * @return the funny
     */
    public int getFunny() {
        return funny;
    }

    /**
     * @param funny the funny to set
     */
    public void setFunny(int funny) {
        this.funny = funny;
    }

    /**
     * @return the useful
     */
    public int getUseful() {
        return useful;
    }

    /**
     * @param useful the useful to set
     */
    public void setUseful(int useful) {
        this.useful = useful;
    }

    /**
     * @return the cool
     */
    public int getCool() {
        return cool;
    }

    /**
     * @param cool the cool to set
     */
    public void setCool(int cool) {
        this.cool = cool;
    }

    /**
     * @return the review_id
     */
    public String getReview_id() {
        return review_id;
    }

    /**
     * @param review_id the review_id to set
     */
    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }
}

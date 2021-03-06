package com.shidun.model;

import java.io.Serializable;

public class PhoneNum implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_num.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_num.mobile_num
     *
     * @mbggenerated
     */
    private String mobileNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table phone_num
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_num.id
     *
     * @return the value of phone_num.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_num.id
     *
     * @param id the value for phone_num.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_num.mobile_num
     *
     * @return the value of phone_num.mobile_num
     *
     * @mbggenerated
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_num.mobile_num
     *
     * @param mobileNum the value for phone_num.mobile_num
     *
     * @mbggenerated
     */
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum == null ? null : mobileNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_num
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mobileNum=").append(mobileNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
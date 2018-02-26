package com.liyashe.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account")
public class Account {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像URL
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 手机号
     */
    @Column(name = "phone_no")
    private String phoneNo;

    private String email;

    @Column(name = "works_num")
    private Integer worksNum;

    @Column(name = "fans_num")
    private Integer fansNum;

    @Column(name = "attention_num")
    private Integer attentionNum;

    /**
     * lingqianbao
     */
    @Column(name = "coin_purse")
    private Integer coinPurse;

    private Date regdate;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取头像URL
     *
     * @return avatar_url - 头像URL
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置头像URL
     *
     * @param avatarUrl 头像URL
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取简介
     *
     * @return introduction - 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置简介
     *
     * @param introduction 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone_no - 手机号
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置手机号
     *
     * @param phoneNo 手机号
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return works_num
     */
    public Integer getWorksNum() {
        return worksNum;
    }

    /**
     * @param worksNum
     */
    public void setWorksNum(Integer worksNum) {
        this.worksNum = worksNum;
    }

    /**
     * @return fans_num
     */
    public Integer getFansNum() {
        return fansNum;
    }

    /**
     * @param fansNum
     */
    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    /**
     * @return attention_num
     */
    public Integer getAttentionNum() {
        return attentionNum;
    }

    /**
     * @param attentionNum
     */
    public void setAttentionNum(Integer attentionNum) {
        this.attentionNum = attentionNum;
    }

    /**
     * 获取lingqianbao
     *
     * @return coin_purse - lingqianbao
     */
    public Integer getCoinPurse() {
        return coinPurse;
    }

    /**
     * 设置lingqianbao
     *
     * @param coinPurse lingqianbao
     */
    public void setCoinPurse(Integer coinPurse) {
        this.coinPurse = coinPurse;
    }

    /**
     * @return regdate
     */
    public Date getRegdate() {
        return regdate;
    }

    /**
     * @param regdate
     */
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
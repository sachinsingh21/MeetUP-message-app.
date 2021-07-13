package com.example.chatter.Cards;

public class cards {
    private String userId;
    private String name;
    private  String profileImageUrl;
    private String need;
    private  String give;
    private String budget;


    public cards(String userId, String name, String profileImageUrl, String need, String give, String budget) {
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.need = need;
        this.give = give;
        this.budget = budget;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public String getGive() {
        return give;
    }

    public void setGive(String give) {
        this.give = give;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}

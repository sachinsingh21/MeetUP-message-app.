package com.example.chatter.Matches;

import com.example.chatter.UserObject.UserObject;

import java.util.ArrayList;

public class MatchesObject {
    private String userId, name, profileImageUrl, need, give, budget, lastMessage, lastTimeStamp, lastSeen, childId;
    private ArrayList<UserObject> userObjectArrayList = new ArrayList<>();


    public MatchesObject(String userId, String name, String profileImageUrl, String need, String give, String budget, String lastMessage, String lastTimeStamp, String lastSeen, String childId) {
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.need = need;
        this.give = give;
        this.budget = budget;
        this.lastMessage = lastMessage;
        this.lastTimeStamp = lastTimeStamp;
        this.lastSeen = lastSeen;
        this.childId = childId;
    }

    public ArrayList<UserObject> getUserObjectArrayList() {
        return  userObjectArrayList;

    }
    public void addUserToArrayList(UserObject mUser){
        userObjectArrayList.add(mUser);

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

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastTimeStamp() {
        return lastTimeStamp;
    }

    public void setLastTimeStamp(String lastTimeStamp) {
        this.lastTimeStamp = lastTimeStamp;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }
}

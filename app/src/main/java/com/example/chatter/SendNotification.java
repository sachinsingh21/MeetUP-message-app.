package com.example.chatter;

import android.util.Log;

import com.onesignal.OneSignal;

import org.json.JSONException;
import org.json.JSONObject;

public class SendNotification {
    public SendNotification(String message, String heading, String notificationKey, String extraField, String extraData){
        if(extraField != null && extraData != null) {
            try {
                JSONObject notificationContent = new JSONObject(
                        "{'contents':{'en':'" + message + "'}," +
                                "'include_player_ids':['" + notificationKey + "']," +
                                "'headings':{'en': '" + heading + "'}," + "'data':{'" + extraField + "':'" + extraData + "'}}");
                OneSignal.postNotification(notificationContent, null);
            } catch (JSONException e) {
                Log.d("error", e.toString());
                e.printStackTrace();
            }
        }
        else {
            try {
                JSONObject notificationContent = new JSONObject(
                        "{'contents':{'en':'" + message + "'}," +
                                "'include_player_ids':['" + notificationKey + "']," +
                                "'headings':{'en': '" + heading + "'}}");
                OneSignal.postNotification(notificationContent, null);
            } catch (JSONException e) {
                Log.d("error", e.toString());
                e.printStackTrace();
            }
        }
    }
}

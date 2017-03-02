package com.example.trebunskiy.weatherapp_withyahooweatherapi.data;

import org.json.JSONObject;

/**
 * Created by trebunskiy on 22.02.2017.
 */

public class Item implements JSONPopulator {
   private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {
condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
}

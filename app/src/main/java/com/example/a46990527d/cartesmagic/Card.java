package com.example.a46990527d.cartesmagic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 46990527d on 18/10/16.
 */

public class Card {

    private String name;
    private String type;
    private String colors;
    private String rarity;
    private String imageUrl;


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", colors='" + colors + '\'' +
                ", rarity='" + rarity + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}

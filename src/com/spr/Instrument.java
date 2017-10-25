/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author vi391762
 */
public class Instrument {
    @Value("Guitar")
    private String name;
    @Value("Ting Ting Ting......")
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
}

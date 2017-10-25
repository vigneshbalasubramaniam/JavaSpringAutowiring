/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author vi391762
 */
public class player {
    @Value("Vignesh")
    private String name;
    private Instrument instrument;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instrument getInstrument() {
        return instrument;
    }
    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

   
    
    
}

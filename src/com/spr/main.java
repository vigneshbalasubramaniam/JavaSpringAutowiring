/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vi391762
 */
public class main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("newSpringXMLConfig.xml");
        player p=(player)context.getBean("player");
        System.out.println("player:"+p.getName()+" instrument:"+p.getInstrument().getName());
        System.out.println("sound:"+p.getInstrument().getSound());
    }
    
}

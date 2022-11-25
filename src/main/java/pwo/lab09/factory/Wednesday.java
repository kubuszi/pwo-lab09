/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

public class Wednesday implements MessageFactory {

@Override
public String createIntroMessage() {
return "Dzień dobry Sroda.";
}

@Override
public String createMainMessage() {
return "Srodowa praca idzie";
}

@Override
public String createClosingMessage() {
return "Trzeci dzień pracy w tym tygodniu minął";
}
}

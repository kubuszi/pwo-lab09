/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

public class Friday implements MessageFactory {

@Override
public String createIntroMessage() {
return "Dzień dobry Piateczek.";
}

@Override
public String createMainMessage() {
return "Piatkowa praca konczy sie";
}

@Override
public String createClosingMessage() {
return "Piaty dzień pracy w tym tygodniu minął";
}
}

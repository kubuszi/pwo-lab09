/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

public class Sunday implements MessageFactory {

@Override
public String createIntroMessage() {
return "Dzień dobry Niedziela.";
}

@Override
public String createMainMessage() {
return "Weekend dzien 2.";
}

@Override
public String createClosingMessage() {
return "Drugi dzien weekendu minal";
}
}

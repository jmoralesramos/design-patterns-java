/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class NoRepeatedWords implements Expression {

    private EndsWithPeriod endsWithPeriod;

    public NoRepeatedWords(EndsWithPeriod endsWithPeriod) {
        this.endsWithPeriod = endsWithPeriod;
    }    
    
    @Override
    public String interpret(String context) {
        context = HelperMethods.noRepeatedWords(context);
        return endsWithPeriod.interpret(context);
    }
    
}

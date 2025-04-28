/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class EndsWithPeriod implements Expression {

    @Override
    public String interpret(String context) {
        return HelperMethods.endsWithPeriod(context);
    }
    
}

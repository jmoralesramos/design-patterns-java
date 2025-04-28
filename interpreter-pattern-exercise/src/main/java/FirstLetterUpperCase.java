/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FirstLetterUpperCase implements Expression {

    private NoRepeatedWords noRepeatedWords;

    public FirstLetterUpperCase(NoRepeatedWords noRepeatedWords) {
        this.noRepeatedWords = noRepeatedWords;
    }

    @Override
    public String interpret(String context) {
        context = HelperMethods.firstLetterLowerCase(context);
        return noRepeatedWords.interpret(context);
    }

}

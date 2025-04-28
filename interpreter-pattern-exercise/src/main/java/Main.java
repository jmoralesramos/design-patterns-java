public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    Expression sentenceInterpreter = new FirstLetterUpperCase(new NoRepeatedWords(new EndsWithPeriod()));
    context = sentenceInterpreter.interpret(context); 
    System.out.println(context);

  }

}

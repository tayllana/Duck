package Duck;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        // Implementação vazia, pois é um quack mudo
        System.out.println("<< Silence >>");
    }
}

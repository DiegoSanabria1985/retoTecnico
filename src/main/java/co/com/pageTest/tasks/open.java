package co.com.pageTest.tasks;

import co.com.pageTest.userinterface.enterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class open implements Task {
    private co.com.pageTest.userinterface.enterPage enterPage;
    public static open thePage(){
        return Tasks.instrumented(open.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(enterPage));
    }
}

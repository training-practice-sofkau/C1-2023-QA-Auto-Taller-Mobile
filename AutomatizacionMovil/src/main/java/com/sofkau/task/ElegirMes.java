package com.sofkau.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.ui.PickerDemoOverview.MES;
import static com.sofkau.ui.PickerDemoOverview.elegirMesUniversal;

public class ElegirMes implements Task {
    private int intUno;
    public ElegirMes enElMes(int intUno){
        this.intUno=intUno;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MES),
                Click.on(elegirMesUniversal(intUno))
        );
    }
    public static ElegirMes elegirMes() {return new ElegirMes();}
}

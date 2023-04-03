package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.test.ui.CalculatorOverview.*;

public class SubtractTask implements Task {

    SetNumeberButtons setNumeberButtons = new SetNumeberButtons();
    private int num1;
    private int num2;
    private Target firstNumber;
    private Target secondNumber;

    public SubtractTask whitFirstNum(int num1){
        this.num1=num1;
        return this;
    }

    public SubtractTask andTheSecondNum(int num2){
        this.num2=num2;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        firstNumber = setNumeberButtons.setNumber(num1);
        secondNumber = setNumeberButtons.setNumber(num2);
        actor.attemptsTo(
                Click.on(firstNumber),
                Click.on(SUBTRACT),
                Click.on(secondNumber)
        );
    }

    public static SubtractTask subtractOperation() {return new SubtractTask();}
}

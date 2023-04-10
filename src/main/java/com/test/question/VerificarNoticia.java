package com.test.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarNoticia implements Question<Boolean> {

    private final Target target;
    private final String patronTexto;

    public VerificarNoticia(Target target, String patronTexto) {
        this.target = target;
        this.patronTexto = patronTexto;
    }

    public static VerificarNoticia conPatron(Target target, String patronTexto) {
        return new VerificarNoticia(target, patronTexto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoActual = target.resolveFor(actor).getText();
        System.out.println("Texto actual: " + textoActual);
        System.out.println("Texto patronTexto: " + patronTexto);
        Pattern pattern = Pattern.compile(patronTexto);
        Matcher matcher = pattern.matcher(textoActual);
        return matcher.find();
    }

}

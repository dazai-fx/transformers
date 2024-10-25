package org.iesvdm.transformer;

public class TransformString implements Transformer <String>{

    private String string;

    public TransformString(String string) { this.string = string; }

    @Override
    public String transform(String input) {
        return string+" "+input;
    }

}

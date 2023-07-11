package br.com.jonasdev.criationalpattern.factorymethod.basecreator;

import br.com.jonasdev.criationalpattern.factorymethod.product.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

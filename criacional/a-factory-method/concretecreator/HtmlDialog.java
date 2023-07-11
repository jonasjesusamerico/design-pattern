package br.com.jonasdev.criationalpattern.factorymethod.concretecreator;

import br.com.jonasdev.criationalpattern.factorymethod.basecreator.Dialog;
import br.com.jonasdev.criationalpattern.factorymethod.product.Button;
import br.com.jonasdev.criationalpattern.factorymethod.product.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

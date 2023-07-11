package br.com.jonasdev.criationalpattern.factorymethod.concretecreator;

import br.com.jonasdev.criationalpattern.factorymethod.basecreator.Dialog;
import br.com.jonasdev.criationalpattern.factorymethod.product.Button;
import br.com.jonasdev.criationalpattern.factorymethod.product.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

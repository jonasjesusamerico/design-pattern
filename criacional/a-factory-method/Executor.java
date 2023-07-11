package br.com.jonasdev.criationalpattern.factorymethod;

import br.com.jonasdev.criationalpattern.factorymethod.basecreator.Dialog;
import br.com.jonasdev.criationalpattern.factorymethod.concretecreator.WindowsDialog;

public class Executor {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        dialog = new WindowsDialog();
//        dialog = new HtmlDialog();

    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}


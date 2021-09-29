package solid.aula4.service.reajuste;

import solid.aula4.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}

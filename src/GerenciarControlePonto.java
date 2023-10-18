import models.Funcionario;
import models.Gerente;
import models.ControlePonto;
import models.Operador;
import models.RegistroPonto;
import models.Secretaria;

class GerenciarControlePonto {
  public static void main(String[] args) {
    // System.out.println(DateUtils.getNow());
    Gerente gerente = new Gerente(1, "Gerente Marcão", "marcao@gmail.com", "428.000.123-13", "marcos.gerente",
        "senhaDoMarcos$");
    Operador operador = new Operador(1, "João Operador", "tugrp@example.com", "123456789", 20);
    Secretaria secretaria = new Secretaria(2, "Maria Secretaria", "tugrp1@example.com", "987654321", "123456", "ramal");

    ControlePonto controleGerente = new ControlePonto();
    ControlePonto controleOperador = new ControlePonto();
    ControlePonto controleSecretaria = new ControlePonto();

    System.out.println(controleGerente.registraEntrada(gerente));
    System.out.println(controleOperador.registraEntrada(operador));
    System.out.println(controleSecretaria.registraEntrada(secretaria));

    System.out.println(controleGerente.registraSaida(gerente));
    System.out.println(controleOperador.registraSaida(operador));
    System.out.println(controleSecretaria.registraSaida(secretaria));
  }
}

package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PageTitle {
    MINHACONTA_TITLE("Minha Conta | OLX"),
    INITIALPAGE_TITLE("OLX - O Maior Site de Compra e Venda do Brasil"),
    LOGINPAGE_TITLE("Minha conta | OLX"),
    RIODEJANEIRO_TITLE("Anúncios no Rio de Janeiro | bomnegócio agora é OLX.com.br"),
    SAOPAULO_TITLE("Anúncios em São Paulo | bomnegócio agora é OLX.com.br"),
    ESPIRITOSANTO_TILTE("Anúncios no Espírito Santo | bomnegócio agora é OLX.com.br"),
    MINASGERAIS_TITLE("Anúncios em Minas Gerais | bomnegócio agora é OLX.com.br");

    private String title;
}

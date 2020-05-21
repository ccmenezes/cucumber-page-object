package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PageTitle {
    MINHACONTA_TITLE("Minha Conta | OLX"),
    INITIALPAGE_TITLE("OLX - O Maior Site de Compra e Venda do Brasil"),
    LOGINPAGE_TITLE("Minha conta | OLX");

    private String title;
}

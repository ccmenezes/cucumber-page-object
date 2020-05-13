package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Pages {
    ESQUECIMINHASENHA_PAGE("https://www3.olx.com.br/account/recover_password"),
    MINHACONTA_PAGE("https://www3.olx.com.br/account/do_login"),
    INITIAL_PAGE("http://www.olx.com.br/");

    private String pathPage;
}

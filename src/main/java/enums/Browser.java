package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Browser {
    FIREFOX_BROWSER("firefox"),
    CHROME_BROWSER("chrome"),
    CHROME_PATH("src/main/resources/chromedriver"),
    FIREFOX_PATH("src/main/resources/geckodriver");

    private String value;
}

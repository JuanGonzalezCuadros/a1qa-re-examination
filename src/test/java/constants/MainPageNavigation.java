package constants;

import lombok.Getter;

@Getter
public enum MainPageNavigation {
    CHECKBOXES("Checkboxes"),
    MULTIPLE_WINDOWS("Multiple Windows");

    private final String label;

    MainPageNavigation(String label) {
        this.label = label;
    }
}

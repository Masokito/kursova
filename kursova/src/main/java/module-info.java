module Maincode {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires xstream;
    requires org.junit.jupiter.api;
    requires dbLogger;
    requires java.sql;
    requires org.simplejavamail;
    requires org.simplejavamail.core;

    opens Maincode to javafx.fxml;
    exports Maincode;
    opens Maincode.taruf to xstream;
    exports Maincode.taruf;
}

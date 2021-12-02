package com.mycompany.singletonjfx.view;

import com.mycompany.singletonjfx.App;
import com.mycompany.singletonjfx.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        var label1 = new Label("Formato de Relatório");
        var fieldFormatoRelatorio = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipos de Gráficos");
        var fieldTipoGraficos = new TextField(config.getTipoGrafico());
        var btnOk = new Button("OK");
        setRoot(new VBox(label1,fieldFormatoRelatorio,label2,fieldTipoGraficos,btnOk));
        btnOk.setOnAction(event -> {
            config.setFormatRelatorios(fieldFormatoRelatorio.getText());
            config.setTipoGrafico(fieldTipoGraficos.getText());
            app.SetScene(new MainScene(app));
        });
    } 
}

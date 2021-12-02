package com.mycompany.singletonjfx.view;

import com.mycompany.singletonjfx.App;
import com.mycompany.singletonjfx.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;


public class RelatorioScene extends AbstractScene {
    private final Config config = Config.getInstance();
    public RelatorioScene(App app) {
        super(app);
        var label = new Label("Formato de Relatório = "+config.getFormatRelatorios());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label,btnVoltar));
        btnVoltar.setOnAction(event -> app.SetScene(new MainScene(app)));
    }
}

package com.mycompany.singletonjfx.view;

import com.mycompany.singletonjfx.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);
        var btnRelatorios = new Button("Relatórios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios,btnConfig));
        
        btnRelatorios.setOnAction(event -> app.SetScene(new RelatorioScene(app)));
        btnConfig.setOnAction(event -> app.SetScene(new ConfigScene(app)));
    }
    
}

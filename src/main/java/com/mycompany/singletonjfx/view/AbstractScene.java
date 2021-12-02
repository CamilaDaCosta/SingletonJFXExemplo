package com.mycompany.singletonjfx.view;

import com.mycompany.singletonjfx.App;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

/**
 *
 * @author camila
 */
public abstract class AbstractScene extends Scene{

    public AbstractScene(App app) {
        super(new TilePane(),640,480);
    }
}

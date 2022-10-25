package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class imageBtn {

    @FXML
    private ImageView imageBtn;

    @FXML
    void initialize() {
        imageBtn.setOnMouseClicked(event -> {
            System.out.println("1111");
        });
    }
}

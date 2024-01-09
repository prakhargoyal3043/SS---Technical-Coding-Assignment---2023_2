<?xml version="1.0" encoding="UTF-8"?>

        <?import javafx.scene.control.*?>
        <?import javafx.scene.layout.*?>
        <?import javafx.scene.input.*?>

<VBox xmlns:fx="http://javafx.com/fxml/1" spacing="10" alignment="CENTER" fx:controller="your.package.MainController">
<HBox spacing="10">
<Label text="Import JSON File:" />
<Button text="Import" onAction="#importJson" />
</HBox>
<HBox spacing="10">
<Label text="Available Fields:" />
<Label text="Display Fields:" />
</HBox>
<HBox spacing="10">
<ListView id="availableFields" prefHeight="100" prefWidth="150" fx:id="availableFields" />
<VBox>
<Button text=">>" onAction="#addSelectedFields" />
<Button text="<<" onAction="#removeSelectedFields" />
</VBox>
<ListView id="displayFields" prefHeight="100" prefWidth="150" fx:id="displayFields" />
</HBox>
<TableView id="productTable" />
</VBox>

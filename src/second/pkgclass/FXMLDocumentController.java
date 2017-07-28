/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second.pkgclass;

import Modelo.Estudiante;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author kevin.rondon
 */
public class FXMLDocumentController implements Initializable {
    
    LinkedList<Estudiante> estudiantes;
    
    @FXML
    private TextField textNombre;
    private TextField textCodigo;
    private Button aceptar;
    private Button mostrar;
    
    @FXML
    private void AceptarAction(ActionEvent event) {
        System.out.println("Clickeame más :Q");
    }
    
    @FXML
    private void MostrarAction(ActionEvent event) {
        System.out.println("Hola bb");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        estudiantes = new LinkedList<>();
    }    
    
}

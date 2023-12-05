package interfacesAbstractFigurasGeometricas;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFiguraDibujable extends JPanel{
//swing awt = pantallas de escriorio FX web
	//Graphics = dibujo
	//Lineas, elipses, cuadrados, texto, presentar imagenes
	public static void main(String[] args) {
		JFrame frame = new JFrame("Paint"); //borde, titulo de la ventana y cuadro de la ventana
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel o lienzo de mi clase principal o main
		//Y agregar dentro de la ventana(Frame)
		AppFiguraDibujable panel = new AppFiguraDibujable();
		frame.add(panel);
		frame.setSize(800,800);
		frame.setVisible(true);
	}
	//generar el grafico a travez del metodo paint() crea componentes y agrega
	//con parametros de objetos declarados
	public  void paint(Graphics g) {
		//crear objeto rectanguloDibujable y llamar al metodo
		RectanguloDibujable rd = new RectanguloDibujable(140.00,140.00,20,20);
		rd.dibujar2D(g);
		CirculoDibujable cd = new CirculoDibujable(80,40,44);
		cd.dibujar2D(g);
		RectanguloDibujable rdl = new RectanguloDibujable(140.0,140.0,80,80);
		rdl.dibujar2D(g);
		//Cuadrado
		//Circulo
		//Triangulo
		//
		
	}
}

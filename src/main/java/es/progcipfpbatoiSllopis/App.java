package es.progcipfpbatoiSllopis;

import de.vandermeer.asciitable.AT_Row;
import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AsciiTable tabla = new AsciiTable();

        tabla.addRule();
        AT_Row fila1 = tabla.addRow("cod", "nombre", "apellidos", "email", "ciudad", "país");
        fila1.setTextAlignment(TextAlignment.CENTER);
        tabla.addRule();
        AT_Row fila2 = tabla.addRow("1", null, "Holmes Alford", "sollicitudin.a@diam.co.uk", "Sens", "Nauru");
        fila2.setTextAlignment(TextAlignment.LEFT);
        tabla.addRule();
        AT_Row fila3 = tabla.addRow("2", null, "Dillon Mcguire", "Cum@sagittisaugueeu.ne", "Calmar", "United States");
        fila3.setTextAlignment(TextAlignment.LEFT);
        tabla.addRule();
        AT_Row fila4 = tabla.addRow("3", null, "Aimee Randall", "Sed@arcu.com", "Teodoro Schmidt", "Zambia");
        fila4.setTextAlignment(TextAlignment.LEFT);
        tabla.addRule();

        System.out.println(tabla.render(200));
    }
}

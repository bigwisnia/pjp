/**
 * Created by Ola on 2016-01-19.
 */
import static javax.swing.JOptionPane.*
ArrayList<Integer> input = []
while (input << showInputDialog('Podaj ciąg liczb', 'np: 1 2 3 4').tokenize(" ")) {

input.each {e ->
    println e
}
}

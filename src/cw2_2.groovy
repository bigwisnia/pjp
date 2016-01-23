/**
 * Created by Ola on 2016-01-19.
 */
import static javax.swing.JOptionPane.*

ArrayList<Integer> inputTab = []
def initialMessage = 'np: 1 2 3 4'

    while (input = showInputDialog('Podaj ciąg liczb', initialMessage )) {
        try {
            if (input) {
                def regexp = /^[0-9 ]+$/  // Only numbers and spaces
                if (input =~ regexp) {
                    inputTab << input.tokenize(" ")
                    inputTab.each { e ->
                        println e
                    }
                    inputTab.clear()
                } else {
                    showMessageDialog(null, 'Błędny format danych, popraw dane!', '', 0)
                    initialMessage = input
                }
            } else if (input.equals('')) {
                showMessageDialog(null, 'Brak danych!', '', 0)
            }
        }
        catch (Exception e) {
            showMessageDialog(null, 'Zakończono bez danych!', '', 0)
        }
    }


import static javax.swing.JOptionPane.*
cyfra = showInputDialog('Podaj cyfre').tokenize()
lista = ['zero' ,'jeden','dwa', 'trzy', 'cztery', 'piec', 'szesc', 'siedem', 'osiem', 'dziewiec']
def i = 0
cyfra.each({ elem ->

            i++

            if(i == cyfra.size()){
                print lista[elem.toInteger()] + '.'
            }
            else{
                print lista[elem.toInteger()] + '-'
            }

    })




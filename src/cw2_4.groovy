import static javax.swing.JOptionPane.showInputDialog

/**
 * Created by Ola on 2016-01-19.
 */

List apply (List l, Closure c){
    l = l.collect(c)
    return l
}
def closure = {it * 2 }
List input = []
while (input << showInputDialog('Podaj ciąg liczb', 'np: 1 2 3 4').tokenize(" ")) {

    println input
    input = input.collect(closure)
    println apply(input, closure)

}


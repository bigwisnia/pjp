import javax.swing.JOptionPane



/**
 * Created by Ola on 2016-01-19.
 */

def convertToInt = { int i = it }
def type = { it.class }
def increment = { ++it }

def getData(param, Closure closure) {
    param.tokenize(' ').collect(closure)
}

while (input = JOptionPane.showInputDialog('Podaj liczby lub słowa:', '')) {
    println getData(input, type)
}

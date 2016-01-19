class Produkt {
    String nazwa
    BigDecimal cena
    Produkt plus(Produkt other){
        new Produkt(cena: this.cena + other.cena)
    }
}

import static javax.swing.JOptionPane.*
def produkty = []
    while (input = showInputDialog('Podaj pozycję = koszt')) {

        def regexp = /^[a-zA-Z ]+ \= +[0-9]+\.*[0-9]*$/  // Start with string + ' = ' + ends with decimal
        if (input =~ regexp) {
            inputParams = input.tokenize(' = ') //split(/ = /)
            produkt = inputParams[0]
            koszt = inputParams[1].toBigDecimal()
        }

        def exists = false
        produkty.each { element ->


            if (element.getNazwa() == produkt) {

                element.setCena(element.getCena() + koszt)

                exists = true
            }
        }
        if (exists == false) {
            produkty << new Produkt(nazwa: produkt, cena: koszt)
        }

    }
    println()
    produkty.each {elem ->

        println elem.getNazwa()
        println elem.getCena()
    }
// ZADANIE TAKIE SAMO JAK CW5_4

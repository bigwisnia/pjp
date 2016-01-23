import static javax.swing.JOptionPane.showInputDialog

getData(10) { it > 0 }            // liczby całkowite większe od 0
println getData() { it.size() > 3 }   // słowa o długości większej od 3 (domyślny typ: String)
println getData()                          // dowolne napisy (słowa)
println getData(BigDecimal)         // dowolne liczby





def List getData(typ = String, closure = null) {

    cyfra = showInputDialog('Podaj cyfre').tokenize()

        for (String s : elementParsed) {
            if(typ == Integer) {
                if(!item.isInteger()) {
                    println "Ciag jest niepoprawny. Wartosc '${item}' nie jest poprawna"
                    error = true;
                    break;
                }

                if(action != null && !action(item.toInteger())) {
                    println "Ciag jest niepoprawny. Wartosc '${item}' nie jest poprawna"
                    error = true;
                    break;
                }

                results.add(item.toInteger())
            }
            else if(typ == BigDecimal) {
                if(!item.isBigDecimal()) {
                    println "Ciag jest niepoprawny. Wartosc '${item}' nie jest poprawna"
                    error = true;
                    break;
                }

                if(action != null && !action(item.toBigDecimal())) {
                    println "Ciag jest niepoprawny. Wartosc '${item}' nie jest poprawna"
                    error = true;
                    break;
                }

                results.add(item.toBigDecimal());
            }
            else {
                if(action != null && !action(item)) {
                    println "Ciag jest niepoprawny. Wartosc '${item}' nie jest poprawna"
                    error = true;
                    break;
                }

                results.add(item);
            }
        }




    results;
}










/**
 * Created by Ola on 2016-01-21.
 */
def fromPLNtoEUR(text) {
    // Pobieranie kursów
    def url = 'http://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml'
    def kursy = new XmlParser().parse(url)

    def map = [:]

    kursy.Cube.Cube.Cube.each {
        map[it.@currency] = it.@rate
    }

    BigDecimal euroInPln = new BigDecimal(map['PLN'])

    text = text.replaceAll(/(\d+\.?\d+) PLN/) { all, kwota->
        BigDecimal euro = kwota.toBigDecimal()/euroInPln
        String.format("%.2f", euro) + ' EUR'
    }
    return  text
}

File filePl = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\PLN.txt')
String fileContents = filePl.getText('UTF-8')
String text = fromPLNtoEUR(fileContents)


File fileEur = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\EUR.txt')
fileEur.write "$text"
println fileEur.text
/**
 * Created by Ola on 2016-01-20.
 */
def changePrice(text) {
    text = text.replaceAll(/\d+/ ){ price->
        String.format("%.2f", price.toBigDecimal()/4.12 )+ '\n'
    }
    return  text
}
File filePl = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\MenuPLN.txt')
String fileContents = filePl.getText('UTF-8')
String text = changePrice(fileContents)

File fileEur = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\MenuEur.txt')
fileEur.write "$text"
println fileEur.text
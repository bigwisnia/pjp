

/**
 * Created by Ola on 2016-01-21.
 */
File filePl = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\dates.txt')
String fileContents = filePl.getText('UTF-8')

def regex = /\d{4}\-\d{2}\-\d{2}/
def matcher = fileContents =~ regex

def res = []
matcher.each { res << it }
println res

res.each {e ->
    def dateParser = new java.text.SimpleDateFormat("yyyy-MM-dd")
    dateParser.lenient = false
    try{
        def date = dateParser.parse("$e")
        println date
    }
    catch (Exception ex){
        println "INVALID DATE" + ' ' + "$e"
    }


}

// Data jesli miesiac jest wiekszy od 31 odejmuje od tej daty np

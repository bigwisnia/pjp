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
    date = new Date().parse('yyyy-MM-dd', "$e" )
    println date
    Calendar cal = Calendar.getInstance();
    cal.setLenient(false);
    cal.setTime();
    try {
        cal.getTime();
    }
    catch (Exception em) {
        System.out.println("Invalid date");
    }


}


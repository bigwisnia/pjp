/**
 * Created by Ola on 2016-01-20.
 */
File file = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\Projekty.txt')
def projectMap = [:]

file.eachLine {l ->



    Scanner s = new Scanner(l).useDelimiter("\\t");
    String tempp = s.next()
    def tempList = []
    while (s.hasNext()){
      tempList << s.next()
    }
    println tempList

    projectMap["$tempp"] = tempList
    s.close()
}
String fileContents = file.getText('UTF-8')
println projectMap

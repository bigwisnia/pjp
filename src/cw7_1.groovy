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
println projectMap


File projektyDuze = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\ProjektyDuze.txt')
projektyDuze.write('')
projectMap.each { String project, List employees ->
    if (employees.size() > 2 ){

        projektyDuze.append("$project" + '\r\n')
    }


}
println projektyDuze.text

List<String> projects = []
def people = []

File programisci = new File('C:\\Users\\Ola\\Desktop\\pjp\\texts\\Programisci.txt')
programisci.write('')

projectMap.each { String project, List employees ->
    projects.add("$project")
    employees.each {e ->
        if (people.contains(e) == false){
            people.add(e)
        }
    }
}
people.each {e->
    List temp = []
    programisci.append("$e"+ '\t')
    projects.each {String p ->
        List list = projectMap.get(p)
        if (list.contains(e)) {
            temp.add(p)
        }

    }
    temp.each {em ->
        programisci.append("$em" + '\t')
    }
    programisci.append('\r\n')
    println e + ': ' + temp
}

println programisci.text
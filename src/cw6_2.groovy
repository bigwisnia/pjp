def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]

///////////////////////////////////////////////////////////////
println('Liczba pracowników w projektach:')
pmap.each { String project, List employees ->
    println("$project: $employees.size")
}



////////////////////////////////////////////////////////////////
println('Projekty, które mają więcej niż dwóch programistów:')
pmap.each { String project, List employees ->
    employees.size() > 2 ? println("$project: $employees.size") : null
}



/////////////////////////////////////////////////////////////////
def projectmap = [:]
List<String> projects = []
def people = []

println('W jakich projektach biorą udział programiści:')
pmap.each { String project, List employees ->
    projects.add("$project")
    employees.each {e ->
        if (people.contains(e) == false){
            people.add(e)
        }
    }
}
people.each {e->
List temp = []
    projects.each {String p ->
                List list = pmap.get(p)
                if (list.contains(e)) {
                    temp.add(p)
                }

        }
        println e + ': ' + temp
        projectmap.put("$e", "$temp")
        temp.clear()
}



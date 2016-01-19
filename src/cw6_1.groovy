List changeList (List l){
    temp = []
    l.each {e ->
        print e + ' '
        temp << e*2
    }
    println()
    return temp
}
list11 = changeList([1,8,23])
list11.each { print it + ' ' }
println()
list12 = changeList(['a', 'b', 'c'])
list12.each { print it + ' ' }
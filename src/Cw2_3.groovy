/**
 * Created by Ola on 2016-01-19.
 */

def closure = {it > 2}
def list = [1,2,3,4]

List apply (List l, Closure c){
    l = l.collect(c)
    return l
}
println apply(list, closure)
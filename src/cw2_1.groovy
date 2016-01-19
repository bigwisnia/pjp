/**
 * Created by Ola on 2016-01-19.
 */

List maxValueIndex (List l){
    def maxList = []
    def x = l.max()
    l.eachWithIndex{ n, idx  ->
        if (n == x){
            maxList << idx
        }

    }
    return [x, maxList]
}


(maxval, ind) = maxValueIndex([1,8,9,8,9,7,6,5,2,4,8,9,9])
println "Maximum: $maxval"
println "Indexes: $ind"
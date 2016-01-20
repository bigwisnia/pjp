/**
 * Created by Ola on 2016-01-20.
 */

import groovy.io.FileType

def list = []

def dir = new File('C:\\Users\\Ola\\Desktop\\pjp')
dir.eachFileRecurse (FileType.FILES) { file ->
    if (file.name.endsWith('.html')){
        list << file
    }

}
int i = 0
list.each {

    println i + ' ' + it.path
    i++
}
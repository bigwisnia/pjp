String reverseWords (String s){

    def result = s.tokenize(" ")

    result.reverseEach {
        print it + ' '
    }
}

reverseWords("Ala ma kota")






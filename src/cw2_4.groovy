import static javax.swing.JOptionPane.showInputDialog

/**
 * Created by Ola on 2016-01-19.
 */

List apply (List l, Closure c){
    l = l.collect(c)
    return l
}
def closure = {it * 2 }
List input = []
while (input << showInputDialog('Podaj ciąg liczb', 'np: 1 2 3 4').tokenize(" ")) {

    println input
    input = input.collect(closure)
    println apply(input, closure)

}

CREATE TABLE RachunekSt(
        IdRachunkuT int NOT NULL PRIMARY KEY,,
        NumerRachunku char(26) NOT NULL,
        DataZalozenia date NOT NULL,
        IdWlascicielaT int NOT NULL,
        ImieWlasciciela varchar(50) NOT NULL,
        NazwiskoWlasciciela varchar(50) NOT NULL,
        DataUrodzeniaWlasciciela date NOT NULL,
        PlecWlasciciela char(1) NOT NULL,
        IdMiastaWlascicielaT int NOT NULL,
        DzielnicaWlasciciela varchar(100) NOT NULL,
        MiastoWlasciciela varchar(255) NOT NULL,
        WojewodztwoWlasciciela varchar(255) NOT NULL,
        GrupaAktywnosci varchar(50) NULL
)
GO

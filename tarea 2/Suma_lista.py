
lista = [10, 10, 10, 10, 10, 10, 10]

def suma( Lista ):
    if len( Lista) == 0:
        return 0
    return Lista.pop(-1) + suma(Lista)

print(suma( lista))


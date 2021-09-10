

def medio(lista):
   x = len(lista) / 2
   #si el total de numeros es par
   if (x % 2) == 0:
       y = int(x - 1)
       #se imprime su mitad
       print(int(lista[y]))
   else:
       lista.pop(-1)
       z = int(len(lista) / 2)
       print(int(lista[z]))


lis = list(input('Introduce una lista de numeros: '))
medio(lis)
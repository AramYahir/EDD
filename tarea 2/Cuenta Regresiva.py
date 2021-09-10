

def cuenta_regresiva(contador):
    if contador == 0:
        print("BOOOOOOOM")
    else:
        print(contador)
        contador -= 1
        cuenta_regresiva(contador)

x = int(input('Escriba un valor: '))
cuenta_regresiva(x)
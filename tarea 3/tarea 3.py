

class Array():
  def __init__( self , tamanio):
        self.__tamanio = tamanio
        self.__data = [ 0 for x in range(self.__tamanio)]

  def get_item(self, index):
        return self.__data[index]

  def to_string( self ):
        print(self.__data)

  def get_lenght(self):
        print(len(self.__data))

  def set_item(dato, index):
        return dato.__data[index]

  def clear(dato):
      dato.__data == dato


ejemplo = Array(5)
ejemplo.to_string()
ejemplo.get_item(3)
ejemplo.get_lenght()
ejemplo.set_item(5)

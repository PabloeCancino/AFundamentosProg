"""
Holas
asas
"""

#definir un clase
class AlgoritmosPy():

    #Metodo
    def factorialRec(self,num):
        if(num<=1):
            return 1
        else:
            return num*self.factorialRec(num-1)

    def fibonaci(self,num):
        if(num<0):
            return -1
        elif(num==0):
            return 0
        elif(num==1):
            return 1
        else:
            return self.fibonaci(num-1)+self.fibonaci(num-2)

obj=AlgoritmosPy()
print("Factorial",obj.factorialRec(int(input("Ingrese un numero:"))))

print("Calcular el Promedio de las Notas")
#Calcula el Promedio
#N1,N2,N3,N4=0,0,0,0
N1=float(input("Nota 01:"))
N2=float(input("Nota 02:"))
N3=float(input("Nota 03:"))
N4=float(input("Nota 04:"))
S=N1+N2+N3+N4
P=S/4
#Categorizando al Estudiante
if(P>16):
    print("Excelente")
elif(P>=13 and P<=16):
    print("Regular")
else:
    print("Malo")

'''
Aqui muestra el resultado
'''
print("El Promedio de las notas ingresadas es:",P)

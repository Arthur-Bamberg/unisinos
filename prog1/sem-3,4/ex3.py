# Considere o seguinte trecho de código:

# Qual é a saída na tela (na ordem correta) quando a variável sexo possuir os seguintes valores antes da execução deste trecho:
# "M" Sexo masculino!
# "f" Sexo feminino!
# "F" Sexo feminino!
# "m" Sexo masculino!
# "K" Sexo Inválido!

def print_sexo(sexo):
    if sexo == "F" or sexo == "f":
        print("Sexo feminino!")
    elif sexo == "M" or sexo == "m":
        print("Sexo masculino!")
    else:
        print("Sexo Inválido!")

print_sexo("M")
print_sexo("f")
print_sexo("F")
print_sexo("m")
print_sexo("K")
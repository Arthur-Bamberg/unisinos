# Qual dos métodos abaixo retorna uma lista com n elementos lidos do teclado, sendo n recebido por parâmetro (perceba que o método deve retornar a lista criada).

def maiorValor(n):
    lista = []
    for i in range(0, n):
        lista.append(input("Digite um valor: "))
    return lista

print(maiorValor(5))
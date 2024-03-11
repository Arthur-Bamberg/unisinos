# **Exercício 8.** Para os itens abaixo, crie o código solicitado:

# solicitar ao usuário 2 valores com ponto flutuante e imprimir na tela o resultado da divisão de um pelo outro com 2 casas decimais
# solicitar ao usuário 2 valores com ponto flutuante e imprimir na tela o resultado da divisão de um pelo outro com 3 casas decimais
# solicitar ao usuário 2 valores com ponto flutuante e imprimir na tela o resultado da divisão de um pelo outro com 4 casas decimais

for i in range(3):
    a = float(input('Digite um valor: '))
    b = float(input('Digite outro valor: '))
    print(f"%.{i+2}f" % (a/b))
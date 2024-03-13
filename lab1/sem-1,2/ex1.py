# Exercício Avançado 1
# • Operações matemáticas:
# – Potência: NUM1 ** NUM2
# – Radiciação: NUM1 ** (1/NUM2) à parêntesis dão precedência!
# • 25 ** (1/2) à raiz quadrada de 5 | 27 ** (1/3) à raiz cúbica de 27
# • Faça um programa em Python que:
# – Receba um float digitado pelo usuário e armazena em A
# – Receba um inteiro digitado pelo usuário e armazene em B
# – Imprima as seguintes mensagens na tela (substitua o X e o Y pelo
# resultado da operação indicada na mensagem):
# • “A multiplicado por B é X”
# • “A dividido por B é X”
# • “A mais B é X e A menos B é Y”
# • “A elevado a B é X” 

A = float(input("Digite um número real: "))
B = int(input("Digite um número inteiro: "))

print(f"A multiplicado por B é {A * B}")
print(f"A dividido por B é {A / B}")
print(f"A mais B é {A + B} e A menos B é {A - B}")
print(f"A elevado a B é {A ** B}")
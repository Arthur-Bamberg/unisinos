# Exercício Avançado 2
# • Faça um programa em Python que:
# – Uma equação do segundo grau possui o seguinte formato:
# • ax2 + bx + c = 0
# – Para resolver esta equação, devemos encontrar as duas raízes, x’ e x’’.
# Usamos, então, a fórmula de Báskara:
# – Assim sendo, crie um programa em Python que recebe os valores inteiros
# a, b e c e retorna as duas raízes da equação de segundo grau
# correspondente.
# • x’ é a raiz positiva
# • x’’ é a raiz negativa Exemplos:
# • x² - 4x - 12 = 0
# § a=1, b=-4, c=-12
# § x’ = 6.0; x’’ = -2.0
# • x² + 8x – 9 = 0
# § a=1, b=8, c=-9
# § x’ = 1; x’’=-9 

a = int(input("Digite o valor de a: "))
b = int(input("Digite o valor de b: "))
c = int(input("Digite o valor de c: "))

delta = b ** 2 - 4 * a * c

x1 = (-b + delta ** (1/2)) / (2 * a)
x2 = (-b - delta ** (1/2)) / (2 * a)

print(f"x' = {x1}; x'' = {x2}")
# Qual das alternativas completa o código abaixo para garantir que o valor digitado será sempre G ou C, solicitando novamente o valor quando um valor inválido for digitado?
# tipoPet = input("Você gostaria de adotar um cachorro ou um gato? Digite C para cachorro ou G para gato. ")
# [...]

tipoPet = input("Você gostaria de adotar um cachorro ou um gato? Digite C para cachorro ou G para gato. ")

while tipoPet != "C" and tipoPet != "G":
    print("\n[ERRO] Digite C ou G")
    tipoPet = input("Você gostaria de adotar um cachorro ou um gato? Digite C para cachorro ou G para gato. ")
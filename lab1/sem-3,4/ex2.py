# Qual das alternativas completa o trecho de código abaixo que deve exibir na tela "bom dia!",  “boa tarde!", "boa noite!" ou “turno inválido!”. Observe que deve ser aceita letra maiúscula ou minúscula.
# turno = input("Digite o turno (M para manhã, T para tarde e N para noite): ")
# [...]

turno = input("Digite o turno (M para manhã, T para tarde e N para noite): ")

if turno == "M" or turno == "m":
  print("bom dia!")
elif turno == "T" or turno == "t":
  print("boa tarde!")
elif turno == "N" or turno == "n":
  print("boa noite!")
else:
  print("turno inválido!")
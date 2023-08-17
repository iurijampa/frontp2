alturas = []
generos = []
soma_alturas_homens = 0
qtd_homens = 0 
qtd_mulher = 0

for i in range(15):
    print(f"Digite as informações da pessoa {i+1}")
    altura = float(input("Altura (em centímetros): "))
    genero = input("Gênero (M/F): ").upper()
    
    alturas.append(altura)
    generos.append(genero)
    
    if genero == 'M':
        soma_alturas_homens += altura
        qtd_homens += 1


print("\nInformações:")
for i in range(15):
    print(f"Pessoa {i+1} - Altura: {alturas[i]} cm, Gênero: {generos[i]}")

maior_altura = max(alturas)
menor_altura = min(alturas)

print(f"\nMaior altura: {maior_altura} cm")
print(f"Menor altura: {menor_altura} cm")

if qtd_homens > 0:
    media_altura_homens = soma_alturas_homens / qtd_homens
    print(f"Média da altura dos homens: {media_altura_homens:.2f} cm")
else:
    print("Nenhum homem.")

print(f"A quantidade de mulheres foi: {qtd_mulher}")
